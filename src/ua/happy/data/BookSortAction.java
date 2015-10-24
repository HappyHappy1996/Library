package ua.happy.data;

public class BookSortAction {

	public static void bubbleSort(Book[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			boolean isSorted = true;
			for (int j = 0; j < array.length - i - 1; j++) {
				int compareResult = array[j].compareTo(array[j + 1]);
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
