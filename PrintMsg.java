import java.util.*;

public class PrintMsg{

    public static boolean  PrintMsg(int arr[]){


         boolean ascending =true;
         boolean decending=true;

         for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
                decending=false;
            }
            if(arr[i]<arr[i-1]){
                ascending=false;
            }

            if(!ascending && !decending){
                break;
            }

            if(ascending){
                System.out.println("ascending");
            }
            else if (decending) {
                System.out.println("decending");
            }
            else{
                System.out.println("not sorted");
            }
         }
return true;
    }


public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
     
       
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
          
         }


         boolean ans=PrintMsg(arr);
         System.out.println(ans);

        
            

            
    }


}