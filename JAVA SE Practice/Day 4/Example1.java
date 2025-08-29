class A
{
	public A()
	{
		System.out.println("inside A constructor");
	}
}
class B
{
	public B()
	{
		System.out.println("inside B constructor");
	}
}
class Parent
{
	public Parent()
	{
		System.out.println("inside Parent constructor");
	}
}
class Child extends Parent   // is-a
{
	private B ob1=new B();     // has-a
	private A ob2=new A();     // has-a
	public Child()
	{
		System.out.println("inside Child constructor");
	}
}
public class Example1 {
	public static void main(String args[])
	{
		new Child();
	}


}
