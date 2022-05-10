package assignment;

import java.util.Scanner;

public class Assignment5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = scan.nextInt();
		System.out.println("Enter Second number");
		int b = scan.nextInt();
		scan.close();
		if (b % a == 0) {
			System.out.println("First number is multiple of second number");
		} else {
			System.out.println("First number is not multiple of second number");
		}
	}

}
