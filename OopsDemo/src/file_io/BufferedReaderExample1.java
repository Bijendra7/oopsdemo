package file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferedReaderExample1 {
	public static void main(String[] args) {
		try {

			Reader reader = new FileReader("D:/temp/demo.txt");
			BufferedReader bfr = new BufferedReader(reader);

			System.out.println(bfr.readLine());
			bfr.mark(0);
			System.out.println(bfr.readLine());
			bfr.reset();

			System.out.println();
			System.out.println(bfr.readLine());
			System.out.println(bfr.readLine());
			System.out.println(bfr.readLine());
			bfr.reset();

			System.out.println();
			System.out.println(bfr.readLine());
			System.out.println(bfr.readLine());
			System.out.println(bfr.readLine());

			bfr.close();
		} catch (IOException e) {

			System.out.println(e.toString());

		}
	}
}
