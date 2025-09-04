package checked_exception1;

import java.io.IOException;

public class Checked_Exception1 {
	
	void disp3() {
		int num=20;
		try {
		if(num>10) {
			throw new IOException();
		}}
		catch (IOException e){
			e.printStackTrace();
			
		}}
	void disp2(){
			disp3();
		}
	void disp1(){
			disp3();
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Checked_Exception1 a = new Checked_Exception1();
  a.disp1();
	}

}
