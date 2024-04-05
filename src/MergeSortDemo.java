import java.util.ArrayList;

public class MergeSortDemo {

	// divide
	// merge sort

	void mergeSort2() {
		int a[] = { 1, 22, 33, 44, 55, 11, 20, 25, 29, 30 };

		int x1[] = { 1, 22, 33, 44, 55 };// i
		int x2[] = { 11, 20, 25, 29, 30 }; // j

		int x3[] = new int[10]; // k

		int i = 0, j = 0, k = 0;
		//
		for (i = 0, j = 0, k = 0; i < x1.length && j < x2.length; k++) {

			if (x1[i] < x2[j]) {
				x3[k] = x1[i];
				i++;
			} else {
				x3[k] = x2[j];
				j++;
			}
		}

		if (i < x1.length) {
			for (; i < x1.length; i++, k++) {
				x3[k] = x1[i];

			}
		}
		if (j < x2.length) {
			for (; j < x2.length; j++, k++) {
				x3[k] = x2[j];
			}
		}

		for (i = 0; i < x3.length; i++) {
			System.out.println(x3[i]);
		}
	}

	void divide(int a[], int low, int upper) {

		if (low < upper) {
			int mid = (low + upper) / 2; // 4
			divide(a, low, mid);// 0 4 0 2 0 1 2 3 4
			divide(a, mid + 1, upper);// 5 9
			merge(a, low, mid, upper);

		}
	}

	void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		// Create temp arrays
		int L[] = new int[n1];
		int R[] = new int[n2];

		// Copy data to temp arrays
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		// Merge the temp arrays

		// Initial indices of first and second subarrays
		int i = 0, j = 0;

		// Initial index of merged subarray array
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// Copy remaining elements of L[] if any
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		// Copy remaining elements of R[] if any
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	void mergetSort(int a[]) {
		divide(a, 0, a.length - 1);
	}

	public static void main(String[] args) {

		int a[] = { 45, 67, 38, 29, 1, -2, 30, 94, 85, 7 };

		MergeSortDemo m = new MergeSortDemo();
		m.mergetSort(a);
//		m.display(a); 

	}
}
