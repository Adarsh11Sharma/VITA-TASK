import java.util.*;

public class UniqueArray {
    
    public static void UniqueArray(int arr[]){
int temp=0;
 boolean isunique=true;

int index=0;
int uniquecount=0;
for(int i = 0;i<arr.length-1;i++){
    isunique=true;
    for(int j=0;j<i;j++){
     if(arr[i]==arr[j]){
         isunique=false;
         break;
     }
    }
    if(isunique){
        uniquecount++;
    }
}

     int newarr[]=new int[uniquecount];

     for(int i =0;i<newarr.length;i++){
        isunique=true;
        for(int j=0;j<i;j++){
            if(arr[i]==arr[j]){
                isunique=false;
                break;
            }
        }
         if(isunique){
        newarr[index++]=arr[i];
     }
     }
    

for(int a:newarr){
    System.out.print( " "+a+" ");
}
    }    
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
     }
    
      UniqueArray(arr);
}}