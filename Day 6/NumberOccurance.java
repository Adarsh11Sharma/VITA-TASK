import java.util.*;

public class NumberOccurance{
    static int count=0;
public static void NumberOccurance(int tar,int []arr){
        count=0;
        
int i,j;
for( i=0;i<arr.length;i++){
    if(arr[i]==tar){
     count++;
    }
}
int newarr[]=new int[count];
int index=0;
for( i=0;i<arr.length;i++){
    if(arr[i]==tar){
     newarr[index++]=i;
    }
}


    for(int a :newarr){
        System.out.println("the element "+tar+" found "+count+" times "+" at index " +a);
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
      NumberOccurance(tar,arr);
    //  int newarr[]=new int[count];
        
            


}}