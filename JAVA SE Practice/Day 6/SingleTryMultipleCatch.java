package checked_exception1;

import java.io.IOException;

public class SingleTryMultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		      int array[] = new int[10];
		      array[10] = 30 / 0;
		    } catch ( ArithmeticException e) // error
			{
		      e.printStackTrace();
		    }
		catch (Exception e) // error
		{
	      e.printStackTrace();
	    }
		System.out.println("Done");
		

	}

}