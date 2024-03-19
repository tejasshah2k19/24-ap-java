import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {

		int a[] = new int[5];
		int search;
		Scanner scr = new Scanner(System.in);

		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter value");
			a[i] = scr.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("Enter number that you want to search");
		search = scr.nextInt();

		int signal = 0;// not   50000
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search) {
				signal = 1;//found
				break;
			}
		}
		if(signal==1)
			System.out.println("found");
		else 
			System.out.println("not found");

		// signal -> red | green

		// 10 20 30 40 50
		// search : 50
		// found

		// search: 60
		// not found

		// 1) linear search
		// 2) binary search

		// algo

	}
}
