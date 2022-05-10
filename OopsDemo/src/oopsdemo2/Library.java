package oopsdemo2;

import java.util.List;

public class Library {

	List<Book> book;

	public Library(List<Book> book) {
		this.book = book;
	}

	void display() {
		for (Book b : this.book) {
			System.out.println("Book Name = " + b.getBookName() + "\nAuthor Name = " + b.getAuthorName());
		}
	}
}
