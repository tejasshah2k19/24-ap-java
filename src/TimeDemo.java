//Object
class Time {
	int hr, mn, s;

	Time(int h, int m, int s) {
		hr = h;
		mn = m;
		this.s = s;
	}

	void display(Time t) {
//		System.out.println(t);
		System.out.println(t.hr + ":" + t.mn + ":" + t.s);

	}

	public String toString() {
		return hr + ":" + mn + ":" + s;
	}

	void change(int hr) {
		hr++;
	}

	void change2(Time x) {
		x.hr++;
	}

	void printHR() {
		System.out.println(this.hr);
	}

	static void printSec() {
//		System.out.println(s);//static 
	}

}

public class TimeDemo {

	public static void main(String[] args) {

		Time t = new Time(19, 2, 0);
		t.display(t);
		t.change(t.hr);// 19//pass by value
		System.out.println(t.hr);
		t.change2(t);// pass by reference
		System.out.println(t.hr);
		t.printHR();
	}
}
