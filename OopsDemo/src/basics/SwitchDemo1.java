package basics;

import java.util.Scanner;

public class SwitchDemo1 {
	public static void main(String[] args) {
		String size;
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		obj.close();
		switch(n)
		{
		case 1:
		case 2:
		case 3:
			size = "kinds";
			break;
		case 29:
			size = "Small";
			break;
		case 42:
			size ="Meadium";
			break;
		case 44:
			size ="Large";
			break;
		case 48:
			size = "Extra Large";
			break;
			default :
				size ="Unknown";
		}
		System.out.println(size);
	}

}
