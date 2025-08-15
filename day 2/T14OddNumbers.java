import java.util.Scanner;

public class T14OddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter start number: ");
        int start = sc.nextInt();
        
        System.out.print("Enter end number: ");
        int end = sc.nextInt();
        
        System.out.println("Odd numbers between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {  // Check if number is odd
                System.out.print(i + " ");
            }
        }
    }
}