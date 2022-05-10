package assignment3;

import java.util.Scanner;

public class assignment2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length of rectangle");
		float length = s.nextFloat();
		System.out.println("Enter breadth of rectangle");
		float breadth = s.nextFloat();
		s.close();
		Area area = new Area();
		System.out.println(area.returnArea(length, breadth));
	}
}
