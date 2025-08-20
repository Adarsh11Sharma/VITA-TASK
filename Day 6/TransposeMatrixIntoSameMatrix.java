import java.util.*;


public   class TransposeMatrixIntoSameMatrix {

    public static void TransposeMatrixIntoSameMatrix(int arr[][]){
        
int temp;

for (int i = 0; i <3; i++) {
    for (int j = 0; j < 3; j++) {
        if(i<j){
            temp=arr[i][j];
            arr[i][j]= arr[j][i];
            arr[j][i]=temp;
        }
    }
    
}
     for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
                
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

        TransposeMatrixIntoSameMatrix(arr);


    }
}