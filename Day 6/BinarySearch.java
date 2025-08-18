import java.util.*;

public class BinarySearch {
    
//     public static void BubbleSort(int arr[]){
// int temp=0;
// for(int i = 0;i<arr.length-1;i++){
//     for(int j=0;j<arr.length-1-i;j++){
//      if(arr[j]>arr[j+1]){
//         temp=arr[j];
//         arr[j]=arr[j+1];
//         arr[j+1]=temp;
//      }
//     }
// }
// for(int a:arr){
//     System.out.print(a);
// }
//     }   

    public static void BinarySearch(int arr[],int no) {
        BubbleSort.BubbleSort(arr);
        int l=0;
        int u=9;
        int m = 0 ,flag=0;

        while(l<=u){
         m=(l+u)/2;
         if(no>arr[m]){
            l=m+1;
         }
         else if(no<arr[m]){
            u=m-1;
         }
         else{
            flag=1;
            break;
         }
        }
        if(flag==1){
            System.out.println(" element found" +m);
        }else{
            System.out.println(" not found");
        }

    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
     int tar=sc.nextInt();
    
      BinarySearch(arr,tar);
}}