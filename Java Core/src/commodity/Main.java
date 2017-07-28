package commodity;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		boolean isRun = true;
		 int a;

			Type type = new Type(Tovar.JEANS);
			Color color = new Color("yellow");
			Price price = new Price(890.5);
			Size size = new Size(28);

			Set<Commodity> commodities = new LinkedHashSet<>();
			Commodity commodity = new Commodity(type,color,price,size);
		while (isRun) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1 - Додати товар в ліст.");
			System.out.println("2 - Видалити товар з ліста.");
			System.out.println("3 - Замінити товар в лісті.");
			System.out.println("4 - Посортувати товари.");
			System.out.println("0 - вийти з програми");
			a = sc.nextInt();
//			switch (a) {
////			case 1: {
////				Commodity.add(commodities);;
////			}
////				break;
////			case 2: {
////				Commodity.remove(commodities);
////			}
////				break;
////			case 3: {
////				Commodity.set(commodities);
////			}
////			break;
////			case 4: {
////				Commodity.set(commodities);
////			}
//			break;
//			case 0: {
//				isRun = false;
//			}
//			}
//			break;
		}
	}

}
