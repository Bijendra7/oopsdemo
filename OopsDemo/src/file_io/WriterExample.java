package file_io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) {
		try {
			Writer wr = new FileWriter("D:/temp/demo.txt");
			wr.write("Bijendra");
			wr.append(" Agrawal");
			wr.close();
			System.out.println("Data writen to file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
