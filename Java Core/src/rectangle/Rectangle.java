package rectangle;

public class Rectangle {
	int a, b;

	Rectangle() {
		printData();

	}

	Rectangle(int a, int b) {
		this.a = a;
		this.b = b;
		s1();
		p1();
	}

	void s1() {
		int s = a * b;
		System.out.println("Площа прямокутника = " + s);
	}

	void p1() {
		int p = 0;
		p = 2 * (a + b);
		System.out.println("Периметр прямокутника = " + p);
	}

	void printData() {
		System.out.println("Довжина прямокутника = " + a + "; ширина = " + b + ".");
	}
}
