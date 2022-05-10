package file_io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("D:/temp/demo.txt");
			int c;
			while ((c = fi.read()) != -1) {
				System.out.print((char) c);
			}
			fi.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
