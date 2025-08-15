import java.util.Scanner;

public class T11NextFiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        System.out.println("Next 5 numbers after " + number + " are:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(number + i);
        }
    }
}