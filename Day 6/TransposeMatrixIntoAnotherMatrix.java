import java.util.*;


public   class TransposeMatrixIntoAnotherMatrix {

    public static void TransposeMatrixIntoAnotherMatrix(int arr[][]){
        int [][]newarr=new int [3][3];
        int p;


for (int i = 0; i <3; i++) {
    for (int j = 0; j < 3; j++) {
        newarr[j][i]= arr[i][j];
    }
    
}
     for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(newarr[i][j]+" ");
                
            }
            System.out.println(" ");
            
        }



}

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.nextInt();
                
            }
            
        }

        // printing the 2d array

         for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
                
            }
            System.out.println(" ");
            
        }

        TransposeMatrixIntoAnotherMatrix(arr);


    }
}