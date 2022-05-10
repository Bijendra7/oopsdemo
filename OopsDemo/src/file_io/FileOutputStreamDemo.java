package file_io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:/temp/demo1.txt", true);

			byte[] b = "Bijendra Agrawal".getBytes();
			fos.write(b);
			fos.close();
			System.out.println("Data has been written in binary file");
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}