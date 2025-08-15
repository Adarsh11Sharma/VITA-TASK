//  Q1.	Accept 10 number user and do sum of it.(do not use array)



import java.util.*;
public class T1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        for (int i=0;i<10;i++){
            int n=sc.nextInt();
            sum=sum+n;
        }

        System.out.println(sum);
    }
}