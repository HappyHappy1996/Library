package ua.happy.data;

import java.util.Date;

public class Book {

	private String name;
	private String authorName;
	private Date publishDate;
	
	public Book(String name, String authorName, int year, int month, int day) {
		this.name = name;
		this.authorName = authorName;
		this.publishDate = new Date(year, month, day);
	}
	
}
