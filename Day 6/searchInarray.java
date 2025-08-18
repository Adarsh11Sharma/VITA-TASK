import java.util.*;

public class searchInarray{
    public static int Search(int tar,int []arr){
int index=-1;
int i;
for( i=0;i<arr.length;i++){
    if(arr[i]==tar){
       
        return i;
       
    }

    
}
return i;
      
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int arr[]=new int[n];
     for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    
     }
     int tar=sc.nextInt();

int index= Search(tar, arr);

if(index!= -1){
     System.out.println("found" +index);
    
    }
    else {
        System.out.println("not found");
    }


}}