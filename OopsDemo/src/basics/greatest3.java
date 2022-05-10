package basics;

import java.util.Scanner;

public class greatest3 {
	public static void main(String[] args) {
		Scanner obj = new Scanner (System.in);
		int a = obj.nextInt();
		int b = obj.nextInt();
		int c = obj.nextInt();
		obj.close();
		if(a>c && a>b)
		{
			System.out.println(a+" is greatest");
		}
		else if(b>c)
		{
			System.out.println(b+" is greatest");
		}
		else
		{
			System.out.println(c+" is greatest");
		}
		
	}

}
