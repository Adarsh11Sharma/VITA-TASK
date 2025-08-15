import java.util.Scanner;

public class T6PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num; // Store original number
        int reversedNum = 0;

        // Reverse the number
        while (num != 0) {
            int digit = num % 10;          // Extract last digit
            reversedNum = reversedNum * 10 + digit; // Build reversed number
            num /= 10;                    // Remove last digit
        }

        // Check if palindrome
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is NOT a Palindrome.");
        }
    }
}