import java.util.*;


public   class MagicMatrix {

public static void MagicMatrix(int arr[][]){

    int i,j,sum,r[n],c[n],sum1,d1,d2,flag=0;
    d1=d2=0;

    for( i=0;i<arr.length;i++){
        sum=0;
        sum1=0;
        for( j=0;j<arr.length;j++)
        {
            
        }
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


    }
}