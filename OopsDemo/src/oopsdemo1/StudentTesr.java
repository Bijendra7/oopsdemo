package oopsdemo1;

public class StudentTesr {
	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		s1.inputDetail();
		s2.inputDetail();
		s3.inputDetail();

		s1.displayDetails();
		System.out.println("Totle displayed from main " + s1.calculate());
		s2.displayDetails();
		System.out.println("Totle displayed from main " + s2.calculate());
		s3.displayDetails();
		System.out.println("Totle displayed from main " + s3.calculate());
	}

}
