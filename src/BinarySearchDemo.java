
public class BinarySearchDemo {

	boolean binarySearch(int a[], int search) {
		int min = 0;// 0
		int max = a.length - 1; // 9

		int mid;

		while (true) {
			mid = (min + max) / 2;
			// => 4

			if (search == a[mid]) {
				System.out.println("found");
				return true;
			} else {
				if (search > a[mid]) {

					// right
					min = mid + 1;
				} else {
					// left
					max = mid - 1;
				}
			}

			if (max < min) {
				System.out.println("Not found");
				return false;
			}
		}

	}

	public static void main(String[] args) {

		int a[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };
		new BinarySearchDemo().binarySearch(a, 10); // 1 -1 
		
	}

}
