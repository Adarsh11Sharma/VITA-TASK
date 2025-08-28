// class Sample
// {
// 	int num1=100; // num1 will be allocated memory only after we create object/s

// 	static int num2=200; // num2 will be allocated memory as soon as Sample class gets loaded.

// }



class A { 

    static{
        System.out.println("Class A");
    }
          }
class B {    
    static{
        System.out.println("Class B");
    }
       }

public class Sample
{
	private A ob1=new A();  // class A will be loaded only after first object of Sample gets created.  - lazy resolution

	private static B ob2=new B();  // class B will be loaded immediately after class Sample gets loaded  -  eager resolution

// Sample m1=new Sample();
public static void main(String[] args) {
    Sample m1=new Sample();
}
}
