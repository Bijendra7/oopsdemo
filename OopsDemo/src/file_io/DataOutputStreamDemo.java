package file_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * java DataOutputStream class allows an application to write primitive data type
 * Java data types to the output stream in a machine independent way.
 */
public class DataOutputStreamDemo {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("D:/temp/demo.txt", true);
			DataOutputStream dos = new DataOutputStream(fos);
			dos.writeDouble(1.1);
			dos.writeInt(55);
			dos.writeBytes("Bijendra");
			dos.writeBoolean(true);

			dos.close();
			fos.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
		try {
			FileInputStream fis = new FileInputStream("D:/temp/demo.txt");
			DataInputStream dis = new DataInputStream(fis);
			double a = dis.readDouble();
			System.out.println(a);
			dis.close();
			fis.close();
		} catch (IOException e) {
			System.out.println(e.toString());
		}
	}
}
