/* Q6.	Accept a marks from user and print it’s grade
a.	Mks>=75  grade A
b.	Mks>=55 grade B
c.	Mks>=35 grade c
d.	Else fail
*/ 
import java.util.*;
public class T6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();

       if(marks>100){
        System.out.println("Enter valid marks");
       } else if(marks>=75){
            System.out.println("Grade A");
        }else if(marks>=55){
            System.out.println("Grade B");
        }else if(marks>=35){
            System.out.println("Grade B");
        }else {
            System.out.println("Fail");
        }
        
    }
}