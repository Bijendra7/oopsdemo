package oopsdemo3;

import java.util.Scanner;

public class DivisionDemo {
	public static void main(String[] args) {
		int a, b, result;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter two number");

		a = s.nextInt();
		b = s.nextInt();
		try {
			result = a / b;
			System.out.println("Division is : " + result);
		} catch (ArithmeticException e) {
			System.out.println(e);
			System.out.println();
			System.out.println();
			System.out.println(e.getMessage());
			System.out.println();
			System.out.println();
			System.out.println(e.toString());
			System.out.println();
			System.out.println();
			e.printStackTrace();
		} finally {
			s.close();
			System.out.println("Betichod yo final warrning hai");
		}

	}
}
