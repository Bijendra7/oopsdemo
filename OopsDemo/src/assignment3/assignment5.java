package assignment3;

public class assignment5 {
	public static void main(String[] args) {
		Manager m1 = new Manager("Bijendra", 21, 9149, "Mathura(Uttar Pradesh)", 35000, "Computer Science", "B.tech");
		Employeee e1 = new Employeee("Prashant", 21, 9149, "Mathura(Uttar Pradesh)", 5000, "Computer Science",
				"B.tech");
		System.out.println("Name\t\tAge\tPhone \tAddress\t\tSalary\tSpecialization\t\tDepartment");
		m1.display();
		e1.display();
		m1.printSalary();
		e1.printSalary();
	}

}
