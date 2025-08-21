import java.util.Scanner;

public class SecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int maxx=Integer.MIN_VALUE;
		int secmaxx=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			
			int a=sc.nextInt();
			
			if(a>maxx) {
				secmaxx=maxx;
				maxx=a;
			}
			if(a>secmaxx && a!=maxx) {
				secmaxx=a;
			}

		}

		System.out.println(secmaxx);

	}

}
