package oopsdemo2;

import java.util.ArrayList;
import java.util.List;

public class Composition {
	public static void main(String[] args) {
		Book b1 = new Book("Essentials of Hindutva", "Vinayak Damodar Savarkar");
		Book b2 = new Book("Hindu Rashtra Darshan", "Vinayak Damodar Savarkar");
		Book b3 = new Book("Inside The Enemy Camp", "Vinayak Damodar Savarkar");
		Book b4 = new Book("Hindu-Pad-Padashahi ", "Vinayak Damodar Savarkar");
		List<Book> book = new ArrayList<Book>();
		book.add(b1);
		book.add(b2);
		book.add(b3);
		book.add(b4);
		Library lib = new Library(book);
		lib.display();
	}
}
