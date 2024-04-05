import java.util.ArrayList;
import java.util.Scanner;

public class ListDemo2 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner scr = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter value");
			int num = scr.nextInt();
			list.add(num);
		}

		// list [ 10:0 20:1 30:2 40:3 50:4 ]

		int sum = 0;
		System.out.println("Content =>");
		for (int i = 0; i < 5; i++) {

			System.out.println(list.get(i));// list[i]
			sum = sum + list.get(i);
		}

		System.out.println("Content =>");
		// for
		// read only
		int min = list.get(0);
		for (Integer x : list) {
			System.out.println(x);
			// sum = sum + x;
			if (min > x) {
				min = x;
			}
		}
		System.out.println(min);
	}
}
