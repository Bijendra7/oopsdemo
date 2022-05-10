package assignment;

import java.util.Scanner;

public class Assignment4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First number");
		int a = scan.nextInt();
		System.out.println("Enter Second number");
		int b = scan.nextInt();
		System.out.println("Enter Third number");
		int c = scan.nextInt();
		scan.close();
		int sum = a + b + c;
		System.out.println("sum of the numbers : " + sum);
		System.out.println("Average of the numbers : " + (float) sum / 3);
		System.out.println("Product of the numbers : " + a * b * c);
		if (a > b && a > c) {
			System.out.println("Greatest number is : " + a);
		} else if (b > c) {
			System.out.println("Greatest number is : " + b);
		} else {
			System.out.println("Greatest number is : " + c);
		}

		if (a < b && a < c) {
			System.out.println("Smallest number is : " + a);
		} else if (b < c) {
			System.out.println("Smallest number is : " + b);
		} else {
			System.out.println("Smallest number is : " + c);
		}

	}

}
