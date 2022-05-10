package collection.framework;

import java.util.ArrayList;

import oopsdemo2.Book;

public class arrayListDemo1 {
	public static void main(String[] args) {
		Book obj = new Book("Bijendra", "Agrawal");
		Book obj1 = new Book("Pk", "Sharma");
		ArrayList<Book> al = new ArrayList<>();
		al.add(obj);
		al.add(obj1);
		for (Book i : al) {
			System.out.println(i.getBookName());
		}
	}
}
