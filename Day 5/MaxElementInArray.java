import java.util.*;

public class MaxElementInArray{

     public static int Min(int[] arr){
                    int Min=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]<Min){
                   Min=arr[i];
                }
            
            }

             return Min;
           
        

    //  System.out.println(Max);
    // System.out.println(Min);
    }

    public static int Max(int [] arr){
           int  Max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>Max){
            Max=arr[i];
         }
         
            }

          return Max;
        }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    

    int arr[]=new int[n];
    

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
        
        //  if(arr[i]>Max){
        //     Max=arr[i];
        //  }
        //  if(arr[i]<Min){
        //     Min=arr[i];
         }
    //      int Min=Max(arr);
    // int Min=Min();

    int smallerst=Min(arr);
    int maxx=Max(arr);

    System.out.println(smallerst);
    System.out.println(maxx);

            }
        



}
