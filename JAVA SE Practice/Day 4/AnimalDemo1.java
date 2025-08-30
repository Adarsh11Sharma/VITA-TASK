class Animal
{
	void makeSound()
	{
	}
}
class Tiger extends Animal
{
	void makeSound()    // overriding makeSound() of Animal
	{
		System.out.println("roar");
	}
}
class Dog extends Animal
{
	void makeSound()  // overriding makeSound() of Animal
	{
		System.out.println("bark");
	}
}
class Cat extends Animal
{
	void makeSound()   // overriding makeSound() of Animal
	{
		System.out.println("meow");
	}
}
public class AnimalDemo1
{
	public static void main(String[] args) 
	{
		// create objects of Tiger,Dog and Cat
		// invoke "makeSound()" on these objects

		Tiger t1=new Tiger();
		t1.makeSound();
		Dog d1=new Dog();
		d1.makeSound();
		Cat c1=new Cat();
		c1.makeSound();
	}
}