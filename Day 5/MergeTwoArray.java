import java.util.*;

public class MergeTwoArray {


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
    
    public static void MergeTwoArray(int arr[],int arr1[]){
      
      int s=arr.length;
      int t=arr1.length;
      int a=s+t;

      
     
   int []MergeTwoArray=new int[a];
   for(int i=0;i<arr.length;i++){
    MergeTwoArray[i]=arr[i];
   }

   for(int i=0;i<arr1.length;i++){
    MergeTwoArray[s+i]=arr1[i];
   }

   BubbleSort(MergeTwoArray);


for(int b:MergeTwoArray){
    System.out.print(b +" ");
}
    }    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }

      int arr1[]=new int[n];
     for(int i=0;i<n;i++){
        arr1[i]=sc.nextInt();
     }
    
      MergeTwoArray(arr ,arr1);
}}