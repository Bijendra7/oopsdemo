package assignment3;

public class Employee1 {

	private int salary;
	private int hours;

	void getInfo(int salary, int hours) {
		this.salary = salary;
		this.hours = hours;
	}

	void addSal() {
		if (this.salary < 500) {
			this.salary += 10;
		}
	}

	void addWork() {
		if (this.hours > 6) {
			this.salary += 5;
		}
	}

	void display() {
		System.out.println("Final salary is : " + this.salary);
	}
}
