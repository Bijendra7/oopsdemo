package basics;

import java.util.Scanner;

public class MatrixDemo2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] a = new int[3][3];
		int[][] b = new int[3][3];
		int[][] c = new int[3][3];
		System.out.println("Enter First array element : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		System.out.println("Enter second array element : ");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = scan.nextInt();
			}
		}
		scan.close();
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("Addition of both array");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(c[i][j] + " ");

			}
			System.out.println();
		}
	}
}
