package ua.happy.data.comparators;

import java.util.Comparator;

import ua.happy.data.Book;


public class NameComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
