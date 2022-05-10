package oopsdemo3;

public class WrapperDemo {
	public static void main(String[] args) {
		int a = 5;
		float b = 10.1f;
		Integer aObj = a;
		Float bObj = b;
		Integer a1 = Integer.valueOf(10);
		int p = a1.intValue();
		System.out.println(aObj);
		System.out.println(bObj);
		System.out.println(p);
		System.out.println(a);
	}
}
