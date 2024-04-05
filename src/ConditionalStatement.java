
public class ConditionalStatement {

	public static void main(String[] args) {

		int a = 1000;
		int b = 2000;
		int c = 3000;

		if (a > b && a > c) {
			System.out.println("a is max");
		}

		if (b > a && b > c) {
			System.out.println("b is max");
		}

		if (c > a && c > b) {
			System.out.println("c is max");
		}

		if (a > b && a > c) {
			System.out.println("a is max");
		}

		else if (b > a && b > c) {
			System.out.println("b is max");
		}

		else if (c > a && c > b) {
			System.out.println("c is max");
		}


		
		
	}

}
