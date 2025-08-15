/*
    1
   12
  123
floud tringle
*/
public class PatternHW5{

    public static void main(String[] args) {
        int num=1;
        for(int i=1;i<=3;i++){


             for(int s=3;s>i;s--){
                System.out.print(" ");
             }


             for(int j=1;j<=i;j++){
                
                System.out.print(j);
                
             }
             System.out.println();
        }
    }
}