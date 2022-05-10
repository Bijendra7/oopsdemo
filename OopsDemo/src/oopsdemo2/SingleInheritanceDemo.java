package oopsdemo2;

class Animal {
	String name;

	public void eat() {
		System.out.println("I can eat");
	}
}

class Dog extends Animal {
	public void display() {
		System.out.println("My name is : " + name);
	}
}

public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Dog obj = new Dog();
		obj.name = "Tiger";
		obj.display();
	}

}
