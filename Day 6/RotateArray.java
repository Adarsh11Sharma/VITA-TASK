import java.util.*;

public class RotateArray {

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k > n
        if (k == 0) return; // No rotation needed
        
        // Three-step reversal for right rotation
        reverse(arr, 0, n - 1);    // Reverse entire array
        reverse(arr, 0, k - 1);    // Reverse first k elements
        reverse(arr, k, n - 1);    // Reverse remaining elements

        // Print the rotated array
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void reverse(int[] arr, int start, int end) {
        // Use two-pointer technique to reverse the subarray
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read array size
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Read array elements
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Read rotation count
        System.out.print("Enter rotation count (k): ");
        int k = sc.nextInt();
        
        // Rotate and print the array
        rotateArray(arr, k);
        
        sc.close();
    }
}