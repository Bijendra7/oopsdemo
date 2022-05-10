package basics;

import java.util.Scanner;

public class switchDemo {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter two number");
		int a = obj.nextInt();
		int b = obj.nextInt();
		System.out.println("Enter operation");
		String op = obj.next();
		obj.close();
		switch(op)
		{
		case "+" :
		{
			System.out.println(a+b);
			break;
		}
		case "-" :
		{
			System.out.println(a-b);
			break;
		}
		default :
		{
			System.out.println("it is not a valid operation");
		}
		}
		
	}

}
