package file_io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationDemo {
	public static void main(String[] args) {
		Employee e11 = null;
		try {
			FileInputStream fis = new FileInputStream("D:/temp/demo1.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			e11 = (Employee) ois.readObject();
			ois.close();
			fis.close();

		} catch (ClassNotFoundException e) {
			System.out.println(e.toString());
		} catch (IOException e) {
			System.out.println(e.toString());
		}

		System.out.println("Name = " + e11.name);
		System.out.println("Address = " + e11.address);
	}
}
