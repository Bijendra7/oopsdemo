package assignment;

import java.util.Scanner;

public class Assignment7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number in first subject");
		float numberOfFirstSubject = scan.nextFloat();
		System.out.println("Enter number in second subject");
		float numberOfSecondSubject = scan.nextFloat();
		System.out.println("Enter number in third subject");
		float numberOfThirdSubject = scan.nextFloat();
		scan.close();
		float sum = numberOfFirstSubject + numberOfSecondSubject + numberOfThirdSubject;
		System.out.println("Total obtain number : " + sum);
		System.out.println("Percentage obtain by student : " + sum / 3);
	}

}
