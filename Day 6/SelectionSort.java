import java.util.*;

public class SelectionSort{
    
    public static void SelectionSort(int arr[]){
int temp=0;
for(int i = 0;i<arr.length-1;i++){
    for(int j=i+1;j<arr.length;j++){
     if(arr[i]>arr[j]){
        temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
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
    
      SelectionSort(arr);
}}