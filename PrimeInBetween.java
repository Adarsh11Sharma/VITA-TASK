import java.util.*;

public class PrimeInBetween{

//     public static int Primecount(int start,int end){
// int count=0;
// for(int i=start;i<=end;i++){
//     for(int j=2;j<=end/2;i++){
//         if(i%j==0){
            
//             count++;
//         }

//     }
// }


//         return count;
//     }
    public static int[] PrimeInBetween(int start,int end){
int j,i;
int n=end-start;
// int n=Primecount(start,end);
int af[]=new int[n/2+1];
for(int  k=start;k<=end;k++){
for( i=2,j=0;i<=k/2;i++){
    if(k%i!=0){
        af[j++]=k;
    }
    
}}
    //   af[j++]=n;
        return af;
    }

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int start=sc.nextInt();
    int end=sc.nextInt();
     int arr[]=PrimeInBetween(start,end);

    
for(int i:arr){
    System.out.println(i);
}
    
    }


}
