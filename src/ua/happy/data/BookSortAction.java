package ua.happy.data;

import java.util.Comparator;

import ua.happy.data.comparators.AuthorNameComparator;
import ua.happy.data.comparators.NameComparator;

public class BookSortAction {

	public static void bubbleSort(Book[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			boolean isSorted = true;
			for (int j = 0; j < array.length - i - 1; j++) {
				int compareResult = array[j].compareTo(array[j + 1]);
				if (compareResult == 0) {
					int basisBeginIndex = j;
					int basisEndIndex = j + 1;
					for (int k = basisEndIndex + 1; k < array.length; k++) {
						if (array[basisBeginIndex].compareTo(array[k]) != 0) {
							break;
						} 
						basisEndIndex++;
					}
					bubbleSort(array, basisBeginIndex, basisEndIndex + 1, new AuthorNameComparator());
					j = basisEndIndex;
					continue;
				}
				if (compareResult > 0) {
					Book temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				break;
			}
		}
	}
	
	public static void bubbleSort(Book[] array, final int from, final int to, Comparator<Book> comparator) {
		int iterationsCount = to - from - 1;
		for (int i = 0; i < iterationsCount; i++) {
			boolean isSorted = true;
			for (int j = from; j < to - i - 1; j++) {
				int compareResult = comparator.compare(array[j], array[j + 1]);
				if (compareResult == 0 && comparator instanceof AuthorNameComparator) {
					int basisBeginIndex = j;
					int basisEndIndex = j + 2;
					for (int k = basisEndIndex; k < array.length; k++) {
						basisEndIndex++;
						if (comparator.compare(array[basisBeginIndex], array[k]) != 0) {
							break;
						} 
					}
					bubbleSort(array, basisBeginIndex, basisEndIndex, new NameComparator());
					j = basisEndIndex - 1;
					continue;
				}
				if (compareResult > 0) {
					Book temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					isSorted = false;
				}
			}
			if (isSorted) {
				break;
			}
		}
	}

}
