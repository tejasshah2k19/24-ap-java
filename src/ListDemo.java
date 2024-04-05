import java.util.ArrayList;
import java.util.Scanner;

public class ListDemo {

	void demo1() {
		ArrayList<String> list = new ArrayList<String>();

		Scanner scr = new Scanner(System.in);
		for (int i = 1; i <= 5; i++) {
			System.out.println("Enter name");
			String name = scr.next();
			list.add(name);
		}
		System.out.println(list.size());

	}

	public static void main(String[] args) {

		int a[] = new int[30]; // 30 size

		// List -> interface
		// ArrayList
		// Vector
		// dynamic

		// collection --- non primitive
		// List Queue Set Map
		// ArrayList XXX XXX XXX
		// Vector

		// 10 20 30 40 50
		// 0th index

//		ArrayList list = new ArrayList();
//		list.add(10);
//		list.add("lamya"); 
//		ArrayList<Integer> list = new ArrayList<String>();

		ArrayList<String> list = new ArrayList<String>();

		Scanner scr = new Scanner(System.in);

		while (true) {
			System.out.println("Enter name : -1 for Exit");
			String name = scr.next();
			if (name.equals("-1") == true ) {   
				break;
			}
			list.add(name);
		}
		System.out.println(list.size());
		System.out.println(list); //list.toString(); 
		

		System.out.println(list.get(0));
		
		list.set(1, "ram");
		
		System.out.println(list);

	}
}
