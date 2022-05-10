package assignment3;

public class assignment1 {
	public static void main(String[] args) {
		Employee e1 = new Employee("Robert", 1994, 25000, "64C- WallsStreet");
		Employee e2 = new Employee("Sam", 2000, 25000, "68D- WallsStreet");
		Employee e3 = new Employee("Jhon", 1999, 25000, "26B- WallsStreet");
		System.out.println("Name\tYear of joining\t\tAddress");
		e1.display();
		e2.display();
		e3.display();
	}
}