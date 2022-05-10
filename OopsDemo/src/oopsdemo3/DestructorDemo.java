package oopsdemo3;

class Test {
	@Override
	public void finalize() {
		System.out.println("Object Destroyed & Garbage Collected");
	}
}

public class DestructorDemo {
	public static void main(String[] args) {

		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		System.out.println(t1.getClass());
		System.out.println(t2.hashCode());
		System.out.println(t3.equals(t1));

		t1 = null;
		t2 = null;
		t3 = null;

		System.gc();
		System.out.println("In Main Method");
	}
}
