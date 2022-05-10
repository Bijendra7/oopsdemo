package oopsdemo1;

import java.util.Scanner;

public class Student {
	int rollNumber;
	String names, coures;
	float m1, m2, m3, totle;
	Scanner scan = new Scanner(System.in);

	public void inputDetail() {
		System.out.println("Enter rollnumber,name,coures");
		rollNumber = scan.nextInt();
		names = scan.next();
		coures = scan.next();
		System.out.println("Enter marks of 3 subjects ");
		m1 = scan.nextFloat();
		m2 = scan.nextFloat();
		m3 = scan.nextFloat();
	}

	public float calculate() {
		totle = m1 + m2 + m3;
		return totle;
	}

	public void displayDetails() {
		System.out.println("************Student Details**************");
		System.out.println("RollNumber : " + rollNumber);
		System.out.println("Name : " + names);
		System.out.println("Coures : " + coures);
		System.out.println("*******************************************");
	}

}
