package oopsdemo2;

class Employee {
	String name;
	int empId;

	Employee(int empId, String name) {
		this.empId = empId;
		this.name = name;
	}

	void display() {
		System.out.println("Employee Id is : " + empId);
		System.out.println("Employee name is : " + name);
	}
}

class Developer extends Employee {
	String Technology;

	Developer(int empId, String name, String technology) {
		super(empId, name);
		this.Technology = technology;
	}

	void dis() {
		System.out.println("Technology used : " + Technology);
	}
}

public class SingleInheritance {
	public static void main(String[] args) {

		Developer obj = new Developer(101, "Bijendra", "Java");
		obj.display();
		obj.dis();
	}
}
