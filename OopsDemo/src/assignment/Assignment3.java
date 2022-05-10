package assignment;

import java.util.Scanner;

public class Assignment3 {
	public static void main(String[] args) {
		System.out.println("Enter first number");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println("Enter Second number");
		int b = scan.nextInt();
		scan.close();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println((float) a / b);

	}

}
