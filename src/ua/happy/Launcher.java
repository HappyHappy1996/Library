package ua.happy;

import java.util.Arrays;

import ua.happy.data.Book;

public class Launcher {

	public static void main(String[] args) {

		final int SIZE = 5;
		Book[] array = new Book[SIZE];
		
		array[0] = new Book("Martin Eden", "Jack London", 1909,	1, 1);
		array[1] = new Book("All Quiet on the Western Front", "Remarque", 1929,	2, 2);
		array[2] = new Book("The Stranger", "Albert Camus", 1942, 3, 3);
		array[3] = new Book("Panzer Leader", "Heinz Guderian", 1951, 4, 4);
		array[4] = new Book("The Lord of the Rings", "Tolkien", 1954, 5, 5);
		Arrays.sort(array);

		System.out.println(Arrays.toString(array));

	}

}
