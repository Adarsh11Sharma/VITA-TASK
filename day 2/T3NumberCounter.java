import java.util.Scanner;

public class T3NumberCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;
        
        System.out.println("Enter 10 numbers:");
        
        for(int i = 1; i <= 10; i++) {
            System.out.print("Enter number " + i + ": ");
            double num = sc.nextDouble();
            
            if(num > 0) {
                positiveCount++;
            } else if(num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        
        System.out.println("\nCount of:");
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Zeros: " + zeroCount);
    }
}