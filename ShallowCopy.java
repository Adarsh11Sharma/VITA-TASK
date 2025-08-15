import java.util.*;

public class ShallowCopy{

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     

    int arr[]=new int[n];
    int cpy[]=new int[5];

    for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
             }
       for(int a:arr){
        System.out.println(a);

         }
         cpy=arr;
         System.out.println(cpy.hashCode());
         System.out.println(arr.hashCode());
    
    for(int a: cpy){
        System.out.println(a);
    }
    }


}
