package oopsdemo3;

import java.util.Scanner;

public class b {
	public static void main(String[] args) throws a {
		int a;
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number");
		a = obj.nextInt();
		if (a == 0) {
			throw new a();
		}
	}
}
