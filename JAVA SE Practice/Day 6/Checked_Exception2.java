package checked_exception1;
import java.util.*;

import java.io.IOException;

public class Checked_Exception2 {
	private int n;



	void disp3(int num) throws IOException{
		
		if(num>10) {
			throw new IOException(" number is higher then 10");
			
		}
		if(num<10) {
			throw new IOException(" number is lower then 10");
			
		}
		
	}
	
	void disp2(int n) throws IOException{
		this.n=n;
		disp3( n);
	}
	void disp1(int n) throws IOException{
		this.n=n;
		disp3(n);
	}
	
	

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Checked_Exception2 a=new Checked_Exception2();
		Scanner sc=new Scanner(System.in);
		int n=5;
		try {
		a.disp1(n);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

		
	
	}

}
