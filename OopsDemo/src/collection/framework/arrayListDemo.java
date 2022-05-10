package collection.framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class arrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Java");
		al.add("Perl");
		al.add("C++");
		al.add("C#");
		System.out.println(al);
		System.out.println("Element at Index 1 : " + al.get(1));
		System.out.println("Does List Contain Element Java ? : " + al.contains("Java"));
		al.add(2, "Bijendra");
		System.out.println(al.get(2));
		System.out.println(al.size());
		Collections.sort(al);
		System.out.println(al);
		Iterator<String> it = al.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}
}
