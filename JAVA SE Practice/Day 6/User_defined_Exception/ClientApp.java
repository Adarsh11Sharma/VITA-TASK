package checked_exception1.User_defined_Exception;

public class ClientApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calc c=new Calc();
	
	int result=0;
	try {
		result=c.sqr(-10);
		}
	catch(MyException m){
		m.printStackTrace();
		System.out.println(m);
		
	}

}}
