package assignment2;

import java.util.Scanner;

public class student {
	String name;
	Scanner s = new Scanner(System.in);

	student() {
		name = "Unknown";
		System.out.println("Name of the student is " + name);
	}

	student(String name) {
		this.name = name;
		System.out.println("Name of student is " + name);
	}

	void display() {
		System.out.println("Name has been assigned");
	}

	public static void main(String[] args) {
		student s1 = new student("Bijendra");
		s1.display();
	}

}
