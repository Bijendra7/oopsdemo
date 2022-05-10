package assignment;

import java.util.Scanner;

public class Assignment6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter rectangle length");
		double length = scan.nextDouble();
		System.out.println("Enter rectangle breadth");
		double breadth = scan.nextDouble();
		scan.close();
		int area = (int) (length * breadth);
		System.out.println("Rectangle area is : " + area);

	}

}
