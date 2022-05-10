package file_io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferedWriterDemo {
	public static void main(String[] args) {
		try {

			Writer wr = new FileWriter("D:/temp/demo.txt", true);
			BufferedWriter bwr = new BufferedWriter(wr);

			bwr.write("Kavita Sharma");
			bwr.newLine();
			bwr.write("Komal Kansal");
			bwr.newLine();
			bwr.close();

			System.out.println("Data has been written in the file");
		} catch (IOException e) {

			System.out.println(e.getMessage());

		}
	}
}