package assignment2;

import java.util.Scanner;

public class Book {
	private String book_name;
	private String author_name;
	private String publisher_name;
	Scanner s = new Scanner(System.in);

	void set() {
		System.out.println("Enter Book name: ");
		book_name = s.next();
		System.out.println("Enter Author name: ");
		author_name = s.next();
		System.out.println("Enter Publisher name: ");
		publisher_name = s.next();
	}

	void get() {
		System.out.println("*******Book Information*********");
		System.out.println("Book name :  " + book_name);
		System.out.println("Author name : " + author_name);
		System.out.println("Publisher name : " + publisher_name);
		System.out.println("********************************");
	}

}
