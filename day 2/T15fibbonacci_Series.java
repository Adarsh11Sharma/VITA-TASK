import java.util.Scanner;

public class T15fibbonacci_Series {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		 int t=sc.nextInt();
		 int a =0,b=1,z;
		 
		 if(t==0) {
			 System.out.println("invalid number");
		 }
		 else if(t==1) {
			 System.out.println(" 0 ");
			
		 }
		 else if(t==2) {
			 System.out.println(" 0   1 ");
			
		 }
		 else if(t>2) {
		 for(int i=1;i<=t-2;i++) {
			 int c =a+b;
			 System.out.println(c);
			 a=b;
			 b=c;
		 }}
		 
//		 System.out.print()
		
	}
}