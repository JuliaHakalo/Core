package methods;

public class Methods {
	private int a;
	private int b;

	public Methods(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	void plus() {
		int c = a + b;
		System.out.println(c);
	}

	void minus() {
		int c = a - b;
		System.out.println(c);
	}

	void mnozennya() {
		int c = a * b;
		System.out.println(c);
	}

	void dilennya() {
		int c = a / b;
		System.out.println(c);
	}

	void if1() {
		if (((getA() < 0) && (getB() < 0)) || ((getA() == 0) && (getB() == 0))) {
			try {
				throw new IllegalArgumentException();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
		}
		if (((getA() == 0) && (getB() != 0)) || ((getA() != 0) && (getB() == 0))) {
			try {
				throw new ArithmeticException();
			} catch (ArithmeticException e) {
				e.printStackTrace();
			}
		}
		if ((getA() > 0) && (getB() > 0)) {
			try {
				throw new MyException("This is my own exception");
			} catch (MyException e) {
				e.printStackTrace();
			}
		}
	}

}
