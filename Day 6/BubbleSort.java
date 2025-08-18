import java.util.*;

public class BubbleSort {
    
    public static void BubbleSort(int arr[]){
int temp=0;
for(int i = 0;i<arr.length-1;i++){
    for(int j=0;j<arr.length-1-i;j++){
     if(arr[j]>arr[j+1]){
        temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
     }
    }
}
for(int a:arr){
    System.out.print(a);
}
    }    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
    
      BubbleSort(arr);
}}