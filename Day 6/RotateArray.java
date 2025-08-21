
// 1234567  k=3 right

import java.util.*;
public class RotateArray{


public static void RotateArray(int []arr,int k){

int n=arr.length;
k=k%n;
    Reverse(arr, 0, n-1);
    Reverse(arr, 0, k-1);
    Reverse(arr, k, n-1);



    for(int a:arr){
        System.out.print(a+" ");
    }


}


public static int[] Reverse(int []arr, int start,int end){
//    int reversearray[]=new int[arr.length];
   int temp;
   int l=arr.length-1;

   for(int i=start;i<=end/2;i++){
      temp=arr[i];
      arr[i]=arr[l];
      arr[l]=temp;
      l--;
   }
   
//    for(int a:arr){
//     System.out.print(a+" ");
//    }
   
    return arr;

}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int k=sc.nextInt();

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }

   RotateArray(arr ,k);
//    Reverse(arr, 0, n-1);
}
}