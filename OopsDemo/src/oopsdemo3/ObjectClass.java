package oopsdemo3;

public class ObjectClass extends Object {
	public static void main(String[] args) {

		Object obj = new Object();
		Object obj1 = new Object();
		Object obj2 = obj1;
		System.out.println(obj.getClass());
		System.out.println(obj.toString());
		System.out.println(obj.hashCode());
		System.out.println(obj.equals(obj1));
		System.out.println(obj1.hashCode());
		System.out.println(obj1.equals(obj2));
	}
}
