package oopsdemo3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultipleDemo {
	public static void main(String[] args) throws IOException {
		try {
			BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
			int a, b, c;
			System.out.println("Enter two number");
			a = Integer.parseInt(rd.readLine());
			b = Integer.parseInt(rd.readLine());
			c = a / b;
			System.out.println("Division : " + c);
		} catch (NumberFormatException nfe) {
			System.out.println(nfe);
		} catch (ArithmeticException ae) {
			System.out.println(ae);
		}
	}
}
