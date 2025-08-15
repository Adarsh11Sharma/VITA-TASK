// Q11.	Accept 3 digit number from user and do the sum of its digit .(do not use any loop)

import java.util.*;
public class T11{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

     int n1=n%10;
      n/=10;
      int n2=n%10;
      n/=10;
      int n3=n%10;

      int sum=n1+n2+n3;
      System.out.println(sum);


    }
}