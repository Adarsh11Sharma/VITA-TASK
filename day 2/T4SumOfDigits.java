import java.util.Scanner;

public class T4SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number; // Store original number for display
        int sum = 0;
        
        // Handle negative numbers by making them positive
        if (number < 0) {
            number = -number;
        }
        
        // Loop to extract and sum each digit
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            sum += digit;            // Add the digit to sum
            number /= 10;            // Remove the last digit
        }
        
        System.out.println("Sum of digits of " + originalNumber + " is: " + sum);
    }
}