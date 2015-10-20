package ua.happy;

import ua.happy.data.Book;
import ua.happy.data.BookSortAction;

public class Launcher {

	public static void main(String[] args) {

		final int SIZE = 10;
		Book[] array = new Book[SIZE];
		
		int i = 0;
		array[i] = new Book("Martin Eden", "Jack London", 1909,	1, 1);
		i++;
		array[i] = new Book("The Lord of the Rings", "Tolkien", 1954, 5, 5);
		i++;
		array[i] = new Book("AssumedBookAssumedAuthor", "AssumedAuthor", 1954, 5, 5);
		i++;
		array[i] = new Book("The Stranger", "Albert Camus", 1942, 3, 3);
		i++;
		array[i] = new Book("AssumedBook3", "Remarque", 1929,	2, 2);
		i++;
		array[i] = new Book("AssumedBook4", "Remarque", 1929,	2, 2);
		i++;
		array[i] = new Book("AssumedBook1", "Remarque", 1929,	2, 2);
		i++;
		array[i] = new Book("All Quiet on the Western Front", "Remarque", 1929,	2, 2);
		i++;
		array[i] = new Book("AssumedBook2", "Remarque", 1929,	2, 2);
		i++;
		array[i] = new Book("Panzer Leader", "Heinz Guderian", 1951, 4, 4);

		System.out.println("========\tBefore\t=======");
		for (Book book : array) {
			System.out.println(book);
		}
		
		BookSortAction.bubbleSort(array);
		
		System.out.println("========\tAfter\t=======");
		for (Book book : array) {
			System.out.println(book);
		}

	}

}
