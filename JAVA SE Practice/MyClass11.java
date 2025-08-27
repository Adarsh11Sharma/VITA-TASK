public class MyClass11
{
	static
	{
		System.out.println("in MyClass11 first static initializer");
	}
	   public static void main(String args[])
	   {
		System.out.println("in main");		
           new B();
		   new A();
		
	    }
	
	static
	{
		System.out.println("in MyClass11 second static initializer");
	}
}
class A
{
	static
	{
		System.out.println("in A first static initializer");
	}
}

class B{
	static{
		System.err.println("class b static 1");
	}

	static{
		System.err.println("class b static 2");
	}
}