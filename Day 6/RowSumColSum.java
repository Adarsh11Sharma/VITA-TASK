
import java.util.*;


public   class RowSumColSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        int r[]=new int[n];
        int c[]=new int[n];
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j]=sc.nextInt();
                
            }
            
        }
//for row sum
        for (int i = 0; i < arr.length; i++) {
           int sum=0;
            for (int j = 0; j < arr.length; j++) {
                sum=sum+arr[i][j];
                r[i]=sum;
            }
            
        }

        //for colum sum

 for (int i = 0; i < arr.length; i++) {
           int sum=0;
            for (int j = 0; j < arr.length; j++) {
                sum=sum+arr[j][i];
                c[i]=sum;
            }
            
        }

        // printing the 2d array

for(int i=0;i<3;i++){
		System.out.print(r[i]+" ");}
   //print col. wise sum
	for(int i=0;i<3;i++)
		System.out.print(c[i]+" ");

       
            
        }


    }
