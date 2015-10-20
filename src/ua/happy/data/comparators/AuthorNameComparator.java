package ua.happy.data.comparators;

import java.util.Comparator;

import ua.happy.data.Book;

public class AuthorNameComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		return o1.getAuthorName().compareTo(o2.getAuthorName());
	}

}
