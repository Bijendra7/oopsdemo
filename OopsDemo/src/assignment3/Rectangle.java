package assignment3;

public class Rectangle {
	private int length;
	private int breadth;

	Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public String Area() {
		int area = this.length * this.breadth;

		return (area + "\t" + this.length + "\t" + this.breadth);
	}

}
