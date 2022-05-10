package oopsdemo2;

public class aggragationDemo {
	public static void main(String[] args) {
		Address address = new Address("Mathura", "Uttar Pradesh", "India", 281403);
		Student student = new Student(17, "Bijendra", address);
		student.display();
	}

}
