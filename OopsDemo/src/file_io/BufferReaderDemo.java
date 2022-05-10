package file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferReaderDemo {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("D:/temp/demo.txt");
			BufferedReader bfr = new BufferedReader(reader);
			int c;
			while ((c = bfr.read()) != -1) {
				System.out.print((char) c);
			}
			bfr.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
