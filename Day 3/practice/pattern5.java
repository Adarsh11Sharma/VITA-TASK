public class pattern5{

    public static void main(String[] args) {
        for(int i=3;i>=1;i--){


             for(int s=i;s>1;s--){
                System.out.print(" __ ");
             }


             for(int j=3;j>=i;j--){
                System.out.print(" "+j+ " ");
             }
             System.out.println("");
        }
    }
}