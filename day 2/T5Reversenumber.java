import java.util.*;

public  class T5Reversenumber{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r;
  while(n!=0){
        
        r=n%10;
        n/=10;
        
    System.out.print(r);
    }



    // System.out.println(r);
    }
}