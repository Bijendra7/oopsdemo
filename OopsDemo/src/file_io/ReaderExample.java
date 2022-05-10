package file_io;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) {
		try {
			Reader rf = new FileReader("D:/temp/demo.txt");
			int c = rf.read();
			while (c != -1) {
				System.out.print((char) c);
				c = rf.read();
			}
			// int c;
			// while ((c = rf.read()) != -1) {
			// System.out.print((char) c);
			// }
			rf.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}