import java.util.Scanner;

public class T8SpecialNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;
        int sum = 0;

        // Calculate sum of factorials of each digit
        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        // Check if it's a Special Number
        if (sum == originalNum) {
            System.out.println(originalNum + " is a Special Number.");
        } else {
            System.out.println(originalNum + " is NOT a Special Number.");
        }
    }

    // Helper method to compute factorial
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}