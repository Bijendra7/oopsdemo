package assignment3;

public class Rectanglee {
	private int length;
	private int breadth;

	Rectanglee(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	void display() {
		System.out.println("Area is : " + this.breadth * this.length);
		System.out.println("Sides are : " + this.breadth + ", " + this.length);
	}
}
