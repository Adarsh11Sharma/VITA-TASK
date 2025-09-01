class base
{
	void disp()
	{
System.out.println("base disp");
	}
}
class sub extends base
{
	void print()
	{
        System.out.println("sub print");
	}
}

public class Demo
{
	public static void main(String[] args) 
	{
		base ref=new sub();
		sub ref2=(sub)ref;  // will fail but why?
		ref2.disp();
	}
}
