package myEntry;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		MyMap<Integer, String> entry = new MyMap<>();
		boolean isRun = true;

		while (isRun) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1 - Додати новий об’єкт в мапу ");
			System.out.println("2 - Видалити об’єкт мапи за ключем");
			System.out.println("3 - Видалити об’єкт мапи за значенням");
			System.out.println("4 - Вивести на екран Set ключів ");
			System.out.println("5 - Вивести на екран List значень ");
			System.out.println("6 - Вивести на екран цілу мапу ");
			System.out.println("anykey - вийти з програми");
			int a = sc.nextInt();
			switch (a) {
			case 1: {
				System.out.println("Введіть ключ");
				int key = sc.nextInt();
				System.out.println("Введіть значення");
				String value = sc.next();
				entry.put(key, value);
				
			}
				break;
			case 2: {
				System.out.println("Введіть ключ");
				int key = sc.nextInt();
				entry.removeByKey(key);
			}
			break;
			case 3: {
				System.out.println("Введіть значення");
				String value = sc.next();
				entry.removeByValue(value);
			}
			break;
			case 4: {
				entry.keySet();
				System.out.println(entry.keySet());
			}
			break;
			case 5: {
				entry.valueList();
				System.out.println(entry.valueList());
			}
			break;
			case 6: {
				entry.syso();
			}
			break;
			default:
				isRun = false;
				break;

			}
		}
	}
}
