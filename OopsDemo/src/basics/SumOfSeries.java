package basics;

import java.util.Scanner;

public class SumOfSeries {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		obj.close();
		int sum = 0;
		int i = 1;
		while (i <= n) {
			sum = sum + i;
			i++;
		}
		System.out.println(sum);
	}

}
