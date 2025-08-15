import java.util.*;



// Q3.	Accept a year from user check if it is leap year or not
public class T3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n=sc.nextInt();

        if(n%4 !=0){
            System.out.println("Not a leap year");
        }
        else{
System.out.println("Leap year");
        }
        

       
    }
}