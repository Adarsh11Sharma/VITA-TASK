import java.util.*;
/* 00 01 02
10 11
20
*/
public   class DIsplayDataofIndex {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.nextInt();  
            }
        }
        // pri 1

         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
            
        }
        /*print 2 problem
        1
        4 5
       7 8 9
       */
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
            
        }

        /*print 2 problem
        1 2 3
          5 6
            9
       */
      for (int i = 0; i < arr.length; i++) {
           
           for (int s = i; s > 0; s--) {
               System.out.print(" ");
           }
           
            for (int j = i; j <arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
            
        }


    }
}