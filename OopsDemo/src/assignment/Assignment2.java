package assignment;

import java.util.Scanner;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Fahrenheit temperature");
		float fahrenheit = scan.nextFloat();
		scan.close();
		float a = (float) 5 / 9;
		float celsius = a * (fahrenheit - 32);
		System.out.println(celsius);

	}

}
