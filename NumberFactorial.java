import java.util.*;

public class NumberFactorial{
    public static int[] NumberFactor(int n){
int j,i;
int af[]=new int[n/2];
for( i=1,j=0;i<=n/2;i++){
    if(n%i==0){
        af[j++]=i;
    }
    
}
      af[j++]=n;
        return af;
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     int arr[]=NumberFactor(n);

    
for(int i:arr){
    System.out.println(i);
}
    
    }


}
