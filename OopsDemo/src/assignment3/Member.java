package assignment3;

public class Member {
	String name;
	int age;
	int phoneNumber;
	String address;
	int salary;

	Member(String name, int age, int phoneNumber, String address, int salary) {
		this.name = name;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.salary = salary;
	}

	void printSalary() {
		System.out.println("Salary : " + this.salary);
	}
}
