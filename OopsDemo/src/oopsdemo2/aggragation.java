package oopsdemo2;

class apple {
	String name;
	String taste;

	public apple(String name, String taste) {
		this.name = name;
		this.taste = taste;
	}
}

class fruite {
	String categary;
	String size;
	apple a;

	public fruite(String categary, String size, apple a) {
		this.categary = categary;
		this.size = size;
		this.a = a;
	}

	void display() {
		System.out.println("Fruite categary is : " + categary);
		System.out.println("Fruite size is : " + size);
		System.out.println("Name of categary is : " + a.name);
		System.out.println("Taste of categary fruite is : " + a.taste);
	}
}

public class aggragation {
	public static void main(String[] args) {
		apple a = new apple("Langda Aam", "Sweet");
		fruite f = new fruite("Mango", "Medium", a);
		f.display();
	}
}
