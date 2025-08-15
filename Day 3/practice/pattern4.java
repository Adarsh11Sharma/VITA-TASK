public class pattern4{

    public static void main(String[] args) {
        for(int i=1;i<=3;i++){

             for(int s=i;s<=2;s++){
                System.out.print(" __ ");
             }




             for(int j=1;j<=i;j++){
                System.out.print(" * ");
             }
             System.out.println("");
        }
    }
}

/*
--1
-12
123 
*/