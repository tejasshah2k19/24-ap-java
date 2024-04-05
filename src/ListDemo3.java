import java.util.ArrayList;

public class ListDemo3 {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(100);
		list.add(20);
		list.add(30);
		list.add(510);

		// contains -> check

		boolean ans = list.contains(25);// boolean -> true false

		System.out.println(ans);

		ans = list.contains(510);
		System.out.println(ans);

		// remove an item from list
		// list.remove(0); //index

		// remove all the items from the list
		// list.clear();

		System.out.println(list.size());// 0
	
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(-10);
		
		
		list.addAll(list2);
		System.out.println(list.size());

		
		
		
		
		
	
	
	}

}
