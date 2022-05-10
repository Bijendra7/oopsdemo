package file_io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class BufferReaderFunctionExample {
	public static void main(String[] args) {
		try {
			Reader reader = new FileReader("D:/temp/demo.txt");
			BufferedReader bfr = new BufferedReader(reader);
			String c = "";
			while ((c = bfr.readLine()) != null) {
				System.out.println(c);
			}
			bfr.close();
			reader.close();

		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
