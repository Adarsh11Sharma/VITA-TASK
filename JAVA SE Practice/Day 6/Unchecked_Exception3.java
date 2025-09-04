package checked_exception1;

import java.io.IOException;
import java.util.Scanner;

public class Unchecked_Exception3 {

	void disp3()
	{
		int num=20;
		if(num>10)
		{
			throw new RuntimeException();
		}
	}
	void disp2()
	{
		disp3();
	}
	void disp1()
	{
		disp2();
	}
	public static void main(String args[])
	{
		Unchecked_Exception3 j=new Unchecked_Exception3();
		j.disp1();
	}


}
