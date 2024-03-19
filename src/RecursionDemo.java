
public class RecursionDemo {

	void add() {
		sub();// call nested
		System.out.println("add()");
	}

	void sub() {
		div();
		System.out.println("sub()");
	}

	void div() {
		System.out.println("div()");
	}

	void mul(int x) {// 2
		if (x != 0) { // base condition
			mul(x - 1);// function call itself -> self call -> recursion
			System.out.println("mul()" + x);// mul mul mul
			// d 2 1
			// j 3 2 1
			// l 1 2 3

		}
	}

	int printF(int n) {
		if (n == 1) {
			return 1;
		} else {
			return n * printF(n - 1);
		}
	}

	void lastQuestion(int x) {// l(3) l(2) print(2);
		if (x == 0) {
			System.out.println("0");
		} else {
			lastQuestion(x--);//
			System.out.println(x + " ");
		}
	}

	void printX(int x) {// 3
		int j = 1;
		for (int i = 1; i <= x; i++) {// 3 time
			System.out.println(++j);// 2 3 4 4
		}
		System.out.println("J = " + j);// 4
	}

	// p(3)
	// return 3 * 2 * 1;
	public static void main(String[] args) {

		RecursionDemo r = new RecursionDemo();
		// r.add(); //div sub add

		// r.mul(3);

		// System.out.println(r.printF(3));// 1 6 6
		r.lastQuestion(3);// 0 , 0 1 2 3 , 0 1 2 3
//		r.printX(3);// 1 1 1 j = 1 , 1 1 1 j =3 , 1 1 1 j = 1
		// 1 2 3 4 , 1 2 3 4 , 1 2 3 4
	}
}
//multiplication table of a number 
//recursion - ? 
