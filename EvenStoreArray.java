import java.util.*;

public class EvenStoreArray{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int newarr[]= new int[n];
    for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();

         if(arr[i]%2==0){
            newarr[i]=arr[i];
         }
          }


     for( int a:newarr){
        System.err.println(a);
    }
    }

  


}
