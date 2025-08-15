/*
 _ _ 1 _ _
 _ 2 _ 2 _
 3 _ 3 _ 3  
333
*/
public class PatternHW3{

    public static void main(String[] args) {
        for(int i=1;i<=3;i++){


             for(int s=3;s>i;s--){
                System.out.print(" ");
             }


             for(int j=1;j<=i;j++){
                System.out.print(i);
                System.out.print(" ");
             }
             System.out.println();
        }
    }
}