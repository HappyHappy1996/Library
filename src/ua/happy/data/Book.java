package ua.happy.data;

import java.util.Date;

import ua.happy.data.comparators.AuthorNameComparator;
import ua.happy.data.comparators.NameComparator;

public class Book implements Comparable<Book> {

	private String name;
	private String authorName;
	private Date publishDate;

	public Book(String name, String authorName, int year, int month, int day) {
		this.name = name;
		this.authorName = authorName;
		this.publishDate = new Date(year, month, day);
	}
	
	public String getName() {
		return name;
	}

	public String getAuthorName() {
		return authorName;
	}

	@Override
	public int compareTo(Book o) {
		int result;
		result = publishDate.compareTo(o.publishDate);
		if (result == 0) {
			result = new AuthorNameComparator().compare(this, o);
		}
		if (result == 0) {
			result = new NameComparator().compare(this, o);
		}
		return result;
	}

	/*
	 * использовал для тестирования
	 */
	@Override
	public String toString() {
		return "Book [name=" + name + ", authorName=" + authorName
				+ ", publishDate=" + publishDate.getYear() + "]";
	}
	
}
