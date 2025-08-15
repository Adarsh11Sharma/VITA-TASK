
// Q12.	Accept years of investment rate of interest and principal amount of investment find simple interest




import java.util.*;
public class T12{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int r=sc.nextInt();
         

         int SI=(p*r*n)/100;
         
         System.out.println(SI);


    }
}