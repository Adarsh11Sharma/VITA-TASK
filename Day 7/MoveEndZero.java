import java.util.*;

public class MoveEndZero{
    public static void MoveEndZero(int []arr){


int count=0,k=0;
int l=arr.length;
        for( int i=0;i<l;i++){
            
            if(arr[i]!=0){
                
                arr[k++]=arr[i];
            }
            else{
                count++;
            }
            
        }
        while(count>0){
                arr[k++]=0;
                count --;
         }

      for(int j:arr){
        System.out.print(j);
        }
    
    }
    

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int arr[]=new int[n];
     for (int i = 0; i < arr.length; i++) {
         arr[i]=sc.nextInt();
         
     }
     
     
     MoveEndZero(arr);
     
     
     }



    

}
    


