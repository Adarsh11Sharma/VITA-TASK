import java.util.Scanner;

public class T10ContinuousSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int number;
        
        System.out.println("Enter numbers (enter 0 to stop):");
        
        do {
            number = sc.nextInt();
            sum += number;
        } while (number != 0);
        
        System.out.println("The sum of all entered numbers is: " + sum);
    }
}