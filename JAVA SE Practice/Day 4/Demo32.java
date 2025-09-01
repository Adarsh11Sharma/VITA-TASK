// use of upcasting
abstract class Shape
{
	abstract void draw();
}
class Triangle extends Shape
{
	void draw()
	{
		System.out.println("in Triangle draw");
	}
}
class Circle extends Shape
{
	void draw()
	{
		System.out.println("in Circle draw");
	}
}
class Rect extends Shape
{
	void draw()
	{
		System.out.println("in Rect draw");
	}
}

public class Demo32
{
//  static void perform(Shape ref){
//     ref.draw();
// }
// public static void main(String[] args) {
//     perform(new Rect());
//     perform(new Triangle());
// }

void perform(Shape ref){
    ref.draw();
}
public static void main(String[] args) {
    Demo31 demo=new Demo31();

    demo.perform(new Rect());
    demo.perform(new Triangle() );
    

}
}