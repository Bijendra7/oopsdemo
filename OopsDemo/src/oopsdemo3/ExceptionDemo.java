package oopsdemo3;

public class ExceptionDemo {
	public static void main(String[] args) {
		String[] a = { "Bijendra", "Prashant", "Raju", "Vishnu", "Abhi" };
		try {
			for (int i = 0; i <= a.length; i++) {
				System.out.println(a[i]);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
