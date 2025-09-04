package checked_exception1.User_defined_Exception;

public class Calc {

	public int sqr(int num) throws MyException{
		if(num<=0) {
			throw new MyException("Zero or negative not alloweed");
			
		}
		return num*num;
	}

}
