package assignment3;

import java.util.Scanner;

public class assignment3 {
	public static void main(String[] args) {
		int salary;
		int hours;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter employee salary : ");
		salary = s.nextInt();
		System.out.println("Enter employee hours : ");
		hours = s.nextInt();
		s.close();
		Employee1 e1 = new Employee1();
		e1.getInfo(salary, hours);
		e1.addSal();
		e1.addWork();
		e1.display();
	}

}
