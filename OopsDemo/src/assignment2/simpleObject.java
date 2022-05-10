package assignment2;

public class simpleObject {
	simpleObject() {
		System.out.println("It's a simple object");
	}

	void display() {
		System.out.println("constructor has been called");
	}

	public static void main(String[] args) {
		simpleObject obj = new simpleObject();
		obj.display();

	}
}
