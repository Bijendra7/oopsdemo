package basics;

import java.util.Scanner;

public class matrixDemo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of row");
		int n = scan.nextInt();
		System.out.println("Enter the size of colume");
		int m = scan.nextInt();
		int[][] a = new int[n][m];
		System.out.println("Enter the matrix element");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				a[i][j] = scan.nextInt();
			}
		}
		scan.close();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
