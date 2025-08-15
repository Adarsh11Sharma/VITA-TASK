/*
12321  
 121
  1

*/
public class PatternHW9{

    public static void main(String[] args) {
       int n=3;
        for(int i=1;i<=n;i++){


             for(int s=i;s<i;s++){
                System.out.print(" ");
             }


             for(int j=i;j<=n;j++){
                
                System.out.print(j);
                
             }
             int r;
             for(r=n-1;r>=i;r--){
                System.out.print(r);
             }
             System.out.println();
        }
    }
}