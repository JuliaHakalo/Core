package rectangle;

public class Main {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.a = 20;
		rectangle.b = 5;
		rectangle.s1();
		rectangle.p1();
		Rectangle r1 = new Rectangle(10, 2);
		r1.printData();
	}

}
