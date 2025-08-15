//  Q2.	Accept a number from user and find a factorial of a number
import java.util.*;
public class T2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;

        for(int i=n;i>0;i--){
       fact=fact*i;
        }
        System.out.println(fact);
    }
}