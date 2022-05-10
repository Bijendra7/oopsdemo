package file_io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {
	public static void main(String[] args) {

		Employee e1 = new Employee();
		e1.name = "Bijendra";
		e1.address = "Kamala nagar kosi kalan mathura";
		e1.SSN = 10001;
		e1.number = 101;

		try {
			FileOutputStream fos = new FileOutputStream("D:/temp/demo1.txt");
			ObjectOutputStream dos = new ObjectOutputStream(fos);

			dos.writeObject(e1);
			dos.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
