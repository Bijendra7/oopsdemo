package assignment3;

class Employeee extends Member {
	String specialization;
	String department;

	Employeee(String name, int age, int phoneNumber, String address, int salary, String specialization,
			String department) {
		super(name, age, phoneNumber, address, salary);
		this.specialization = specialization;
		this.department = department;
	}

	void display() {
		System.out.println(this.name + "\t" + this.age + "\t" + this.phoneNumber + "\t" + this.address + "\t"
				+ this.salary + "\t" + this.specialization + "\t" + this.department);
	}

}
