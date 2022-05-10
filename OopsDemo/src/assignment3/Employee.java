package assignment3;

public class Employee {
	String name;
	int yearOfJoining;
	int salary;
	String address;

	Employee(String name, int yearOfJoining, int salary, String address) {
		this.name = name;
		this.yearOfJoining = yearOfJoining;
		this.salary = salary;
		this.address = address;
	}

	void display() {
		System.out.println(name + "\t" + yearOfJoining + "\t\t\t" + address);
	}
}
