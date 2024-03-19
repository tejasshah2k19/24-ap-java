
public class SortingDemo {

	int a[] = { 45, 67, 38, 29, 1, -2, 30, 94, 85, 7 };

	void insertionSort() {
		int tmp;
		int j;
		for (int i = 1; i < a.length; i++) {
			tmp = a[i];
			for (j = i - 1; j >= 0; j--) {
				if (tmp < a[j]) {
					a[j + 1] = a[j];
				} else {
					break;
				}
			}
			a[j + 1] = tmp;

		}

	}

	public static void main(String[] args) {

//		bubble sort 
//
//		selection sort
//
//		insertion sort
//
//		merge sort 
//
//		quick sort 

	}
}
