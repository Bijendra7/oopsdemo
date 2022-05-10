package basics;

import java.util.Scanner;

public class greatest2 {public static void main(String[] args) {
	Scanner obj = new Scanner(System.in);
	System.out.println("enter two numbers");
	int a=obj.nextInt();
	int b=obj.nextInt();
	obj.close();
	if(a>b)
	{
		System.out.println(a+" is greater");
	}
	else
	{
		System.out.println(b+" is greater");
	}
}

}
