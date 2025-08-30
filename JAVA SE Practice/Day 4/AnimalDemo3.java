import java.util.*;

class Animal
{
	void makeSound()
	{
	}
}
class Tiger extends Animal
{
	void makeSound()
	{
		System.out.println("roar");
	}
}
class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("bark");
	}
}
class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("meow");
	}
}
public class AnimalDemo3
{
	static void perform(Animal ref)
	{
        ref.makeSound();
          }
	// 	// accept a choice from user i.e. whether Dog , Cat or Tiger
	// 	// based on that create object and invoke "makeSound()"
	// 	// 	[ use scanner to accept a string and switch... case to invoke methods ]
	// }
   public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter animal (Tiger/Dog/Cat): ");
        String choice = sc.next();
        perform(choice);
        sc.close(); // It's good practice to close the scanner
    }
}