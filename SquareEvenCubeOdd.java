import java.util.*;

public class SquareEvenCubeOdd{
public static  void SquareEvenCubeOdd(int[] a){
for(int i=0;i<a.length;i++){
   a[i] = (i % 2 == 0) ? a[i] * a[i]  // Square even indices
                              : a[i] * a[i] * a[i];  // Cube odd indice

}
for(int i: a){
    System.out.print(i+" ");
}
}
public static void Disper(int[] a ){
    for(int i=0;i<a.length;i++){
        a[i]=a[i]*a[i];
    }
    for(int i: a){
    System.out.print(i+" ");
}
}
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
     
int a;
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
         arr[i]=sc.nextInt();
           
            }
            System.out.println("arr lenght" + arr.length);
SquareEvenCubeOdd(arr);
            
    }


}
