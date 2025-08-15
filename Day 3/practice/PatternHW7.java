/*
  1
 121
12321
floud tringle
*/
public class PatternHW7{

    public static void main(String[] args) {
       
        for(int i=1;i<=3;i++){


             for(int s=3;s>i;s--){
                System.out.print(" ");
             }


             for(int j=1;j<=i;j++){
                
                System.out.print(j);
                
             }
             int r;
             for(r=i-1;r>=1;r--){
                System.out.print(r);
             }
             System.out.println();
        }
    }
}