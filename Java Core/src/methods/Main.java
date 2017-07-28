package methods;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean isRun = true;
		Methods methods = new Methods(7,2);
		while (isRun) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1 - Додати два числа ");
			System.out.println("2 - Відняти два числа");
			System.out.println("3 - Помножити");
			System.out.println("4 - Поділити");
			System.out.println("anykey - вийти з програми");
			int a = sc.nextInt();
			switch (a) {
			case 1: {
				methods.plus();
			methods.if1();
			}
				break;
			case 2: {

				methods.minus();
				methods.if1();
			}
				break;
			case 3: {

				methods.mnozennya();
			methods.if1();
			}
				break;
			case 4: {

				methods.dilennya();
				methods.if1();
			}
				break;
			default:
				isRun = false;
				break;
			}
		}
	}
}
