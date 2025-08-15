/* Q7.	Accept a number from user -
 if it is divisible by 3 print “three” , if it is divisible by 7 print “seven” and
  if it is divisible by both(3,7) print “three -seven” */
import java.util.*;
public class T7{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        if (n%3==0 && n%7==0){
System.out.println("three-seven");
        }
        else if(n%3==0){
            System.out.println("three");
        }
        else if(n%7==0){
            System.out.println("seven");
        }
        else{
            System.out.println("not divisible by 3 &7");
        }

    }
}