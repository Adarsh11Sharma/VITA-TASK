import java.util.*;

public class DecimalToBinary{


    public static void DecimalToBinary(int num){
        int binary[]=new int[8];
        int index=0;
        
        
        if(num==0){
            System.out.println("0");
        }

            while(num>0){
           binary[index++]=num%2;
           num=num/2;

            }
        
        for(int i=binary.length-1;i>=0;i--){
            System.out.print(binary[i]);
        }


        
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        DecimalToBinary(num);
    }
}