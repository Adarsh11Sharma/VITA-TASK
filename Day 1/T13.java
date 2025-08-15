// Q13.	Problem: Given the length of four sides determine whether they can be used to create a polygon and determine
//  if that polygon is a square. A polygon can be created 
//  if no single side is greater than the sum of the other three sides. 
//  Display a ONE when the status (polygon or square) is confirmed and ZERO when the status cannot be confirmed.

import java.util.*;
public class T13{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int square=0;
        int polygon=0;

        if ((a+b+c>d)&&(a+b+d>c)&&(a+c+d>b)&&(b+c+d>a)) {
            polygon++;
            if((a==b)&&(b==c)&&(c==d)){
            square++;
        }
        }

        System.out.println("square " +square);
        System.out.println("polygon " +polygon);
        
        
    }
}