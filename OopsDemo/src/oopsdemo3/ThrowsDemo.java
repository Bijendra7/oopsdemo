package oopsdemo3;

public class ThrowsDemo {
	void Division() {
		int a = 45, b = 0, rs;
		rs = a / b;
		System.out.println("The result is: " + rs);
	}

	public static void main(String[] args) {
		ThrowsDemo td = new ThrowsDemo();
		try {
			td.Division();
		}

		catch (ArithmeticException ae) {
			System.out.println("Chutiye zero ko hta");
		}
	}
}
