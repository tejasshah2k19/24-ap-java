
public class RecurAgain {

	// 15 -> 1 to 15
	// 15 -> 15 to 1
	void print(int num) {
		if (num != 0) {
			System.out.println(num);
			print(num - 1);
		}
	}

	void print2(int num) {
		if (num != 0) {
			print2(num - 1);
			System.out.println(num);
		}
	}

	// 10

	void multi(int i, int num) {
		if (i <= 10) {
			System.out.println(num + " * " + i + " = " + (num * i));// 10 * 1 = 10
			multi(i + 1, num);
		}
	}

	public static void main(String[] args) {

		RecurAgain r = new RecurAgain();

		// scan main
		//r.print2(15);
		r.multi(1, 10);
	}
}
