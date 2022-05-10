package basics;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		System.out.println("Enter number");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		obj.close();
		if(a%2==0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}
	}

}
