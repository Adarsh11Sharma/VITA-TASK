import java.util.Scanner;

public class T12PrintNumbersAfter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a starting number: ");
        int start = sc.nextInt();
        
        System.out.print("Enter how many numbers to print: ");
        int count = sc.nextInt();
        
        System.out.println("Printing " + count + " numbers after " + start + ":");
        for (int i = 1; i <= count; i++) {
            System.out.println(start + i);
        }
    }
}