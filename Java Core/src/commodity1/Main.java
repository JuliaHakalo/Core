package commodity1;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class Main {

	public static void main(String[] args) {
		boolean isRun = true;
		 int a;

		

			Set<Commodity> commodities = new LinkedHashSet<>();

		while (isRun) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1 - Додати товар в ліст.");
			System.out.println("2 - Видалити товар з ліста.");
			System.out.println("3 - Замінити товар в лісті.");
			System.out.println("4 - Посортувати товари.");
			System.out.println("0 - вийти з програми");
			a = sc.nextInt();
			switch (a) {
			case 1: {
				Commodity.add(commodities);
			}
				break;
			case 2: {
				Commodity.remove(commodities);
			}
				break;
			case 3: {
				Commodity.set(commodities);
			}
			break;
//			case 4: {
//				System.out.println("1 - Посортувати за ціною");
//				System.out.println("2 - Посортувати за типом товару");
//				System.out.println("3 - Посортувати за розміром");
//				System.out.println("3 - Посортувати за кольором");
//				int b = sc.nextInt();
//				switch (b) {
//				case 1:{
//					int c = sc.nextInt();
//					System.out.println("1 - від меншої до більшої");
//					System.out.println("2 - від більшої до меншої");
//					switch (c) {
//					case 1:
//						commodities.sort((o1, o2) -> Integer.compare(o1.getSize(), o2.getSize()));
//						break;
//
//					case 2:Commodity.sortPriceDOWN(commodities); 
//						break;
//						default: Commodity.sortPriceDOWN(commodities); 
//					}
//				}
//				case 2:{
//					int c = sc.nextInt();
//					System.out.println("1 - від a до z");
//					System.out.println("2 - від z до a");
//					switch (c) {
//					case 1:
//						Commodity.sortTypeUP(commodities);
//						break;
//
//					case 2:Commodity.sortTypeDOWN(commodities);
//						break;
//						default: Commodity.sortTypeDOWN(commodities); 
//					}
//				}
//				case 3:{
//					int c = sc.nextInt();
//					System.out.println("1 - від меншої до більшої");
//					System.out.println("2 - від більшої до меншої");
//					switch (c) {
//					case 1:
//						Commodity.sortSizeUP(commodities);
//						break;
//
//					case 2:Commodity.sortSizeDOWN(commodities);
//						break;
//						default: Commodity.sortSizeDOWN(commodities); 
//					}
//				}
//				case 4:{
//					int c = sc.nextInt();
//					System.out.println("1 - від a до z");
//					System.out.println("2 - від z до a");
//					switch (c) {
//					case 1:
//						Commodity.sortColorUP(commodities);
//						break;
//
//					case 2:Commodity.sortColorDOWN(commodities);
//						break;
//						default: Commodity.sortColorDOWN(commodities); 
//					}
//				}
//				}
//				
//			}
//			break;
//			case 0: {
//				isRun = false;
//			}
//			}
//			break;
		}
	}
	}
}
