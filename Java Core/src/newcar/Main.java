package newcar;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		boolean isRun = true;
		 Koleso koleso1 = new Koleso(50);
		Kyzov k1 = new Kyzov(Color.BLACK);
		 Kermo kermo1 = new Kermo(Buttons.NOBUTTONS);
		Koleso koleso2 = new Koleso(65);
		 Kyzov k3 = new Kyzov(Color.RED);
		 Kermo kermo2 = new Kermo(Buttons.WITHBUTTONS);

		 Set<Car> cars = new LinkedHashSet<>();
		cars.add(new Car("Marcedes",kermo1,koleso1,k1));
		 cars.add(new Car("Lamborghini",kermo2,koleso2,k3));


		 
		while (isRun) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1 - додати машину");
			System.out.println("2 - «найти машини, €к≥ мають введений д≥аметр кол≥с");
			System.out.println("3 - «найти машини, €к≥ мають введений д≥аметр кол≥с та кол≥р кузова. ");
			System.out.println("4 - «ам≥нити в ус≥х машинах, €к≥ мають червоний кол≥р кузова, кермо на ≥нше. ");
			System.out.println("5 -  «б≥льшити д≥аметр кол≥с вдв≥ч≥, €кщо кермо маЇ кнопочки. ");
			System.out.println("6 - «ам≥нити ус≥ машини, €к≥ мають колеса д≥аметром менш≥ за введене значенн€, на ≥нш≥ машини. ");
			System.out.println("7 - «найти машини, €к≥ використовують введений тип кузова. ");
			System.out.println("8 - ¬идалити з л≥ста ус≥ машини, €к≥ мають введений кол≥р кузова.");
			System.out.println("9 - «ам≥нити ус≥м машинам, д≥аметр кол≥с €ких лежить у введеному д≥апазон≥ шини на зимов≥. ");
			System.out.println("10 - ¬идалити ус≥ машини, €к≥ мають введений тип кузова та введений д≥апазон д≥аметра керма.");
			System.out.println("11 - «апам'€тати ≥ндекси машин, €к≥ мають введений тип кузова. ");
			System.out.println("12 - ћашинам, €к≥ мають вказаний кол≥р кузова та вказаний д≥аметр колеса, зм≥нити тип шин на вказаний. ");
			System.out.println("13 - ¬идалити машини, д≥аметр колес €ких попадаЇ у вказаний д≥апазон. ");
			System.out.println("14 - «найти машини, €к≥ мають вказаний тип шин та д≥аметр кол≥с €ких попадаЇ у вказаний д≥апазон. ");
			System.out.println("15 - показати вс≥ машини");
			System.out.println("0 - вийти з програми");
			int q = sc.nextInt();
			switch (q) {
			case 1: {
				System.out.println("¬вед≥ть бренд");
				String brand = sc.next();
				System.out.println("¬вед≥ть тип керма");
				String kermo11 = sc.next();
				Buttons buttons = Buttons.valueOf(kermo11.toUpperCase());
				Kermo kermo = new Kermo(buttons);
				System.out.println("¬вед≥ть д≥аметр колеса");
				int diametrkolesa = sc.nextInt();
				Koleso koleso = new Koleso(diametrkolesa);
				System.out.println("¬вед≥ть кол≥р кузова");
				String color1 = sc.next();
				Color color = Color.valueOf(color1.toUpperCase());
				Kyzov kyzov = new Kyzov(color);
				System.out.println("¬вед≥ть тип кузова");
				String typ = sc.next();
				Typkyzova typkyzova = Typkyzova.valueOf(typ.toUpperCase());
				kyzov = new Kyzov(typkyzova);
				System.out.println("¬вед≥ть тип шини");
				String shyna = sc.next();
				Typshyny typshyny = Typshyny.valueOf(shyna.toUpperCase());
				koleso = new Koleso(typshyny);
				Car car = new Car(brand, kermo, koleso, kyzov);
				cars.add(car);
			}
				break;
			case 2: {
				System.out.println("¬вед≥ть д≥аметр колеса");
				int diametr = sc.nextInt();
				for (Car car : cars) {
					if (car.getKoleso().getDiametrkolesa() == diametr) {
						System.out.println(car);
					}

				}
				break;
			}
			case 3: {
				System.out.println("¬вед≥ть д≥аметр колеса та кол≥р кузова");
				int diametr = sc.nextInt();
				String color1 = sc.next();
				Color color = Color.valueOf(color1.toUpperCase());
				for (Car car : cars) {
					if ((car.getKoleso().getDiametrkolesa() == diametr) && (car.getKyzov().getColor() == color)) {
						System.out.println(car);
					}
				}
				;
				break;
			}
			case 4: {
				for (Car car : cars) {
					if (car.getKyzov().getColor() == Color.RED) {
						if (car.getKermo().getButtons() == Buttons.NOBUTTONS) {
							car.getKermo().setButtons(Buttons.WITHBUTTONS);
						} else {
							car.getKermo().setButtons(Buttons.NOBUTTONS);
						}
					}
				}
				;
				break;
			}
			case 5: {
				for (Car car : cars) {
					if (car.getKermo().getButtons() == Buttons.WITHBUTTONS) {
						car.getKoleso().setDiametrkolesa(car.getKoleso().getDiametrkolesa()*2);
					}
				}
				;
				break;
			}
			case 6: {
				for (Car car : cars) {
					System.out.println("¬вед≥ть д≥аметр колеса");
					int diametr = sc.nextInt();
						if (car.getKoleso().getDiametrkolesa() < diametr){
							System.out.println("¬вед≥ть бренд");
							String d1 = sc.next();
							car.setBrand(d1);
							System.out.println("¬вед≥ть тип керма");
							String kermo11 = sc.next();
							Buttons buttons = Buttons.valueOf(kermo11.toUpperCase());
							car.getKermo().setButtons(buttons);
							System.out.println("¬вед≥ть д≥аметр колеса");
							int diametrkolesa = sc.nextInt();
							car.getKoleso().setDiametrkolesa(diametrkolesa);
							System.out.println("¬вед≥ть кол≥р кузова");
							String color1 = sc.next();
							Color color = Color.valueOf(color1.toUpperCase());
							car.getKyzov().setColor(color);
							System.out.println("¬вед≥ть тип кузова");
							String typ = sc.next();
							Typkyzova typkyzova = Typkyzova.valueOf(typ.toUpperCase());
							car.getKyzov().setTypkyzova(typkyzova);
							System.out.println("¬вед≥ть тип шини");
							String shyna = sc.next();
							Typshyny typshyny = Typshyny.valueOf(shyna.toUpperCase());
							car.getKoleso().setTypshyny(typshyny);
						}
					}
				
				;
				break;
			}
			case 7: {
				System.out.println("¬вед≥ть тип кузова");
				String k4 = sc.next();
				Typkyzova kyzov1 = Typkyzova.valueOf(k4.toUpperCase());
				Iterator<Car> iter = cars.iterator();
				while (iter.hasNext()) {
					Car tmp = iter.next();
					if (tmp.getKyzov().getTypkyzova() == kyzov1) {
						System.out.println(tmp);
					}
				}
				break;
			}
			case 8: {
				System.out.println("¬вед≥ть кол≥р кузова");
				String color1 = sc.next();
				Color color2 = Color.valueOf(color1.toUpperCase());
				Iterator<Car> iter = cars.iterator();
				while (iter.hasNext()) {
					Car tmp = iter.next();
					if (tmp.getKyzov().getColor() == color2) {
						iter.remove();
					}
				}
				break;
			}
			case 9: {
				System.out.println("¬вед≥ть м≥н≥мальний д≥аметр колеса");
				int min = sc.nextInt();
				System.out.println("¬вед≥ть максимальний д≥аметр колеса");
				int max = sc.nextInt();
				Iterator<Car> iter = cars.iterator();
				while (iter.hasNext()) {
					Car tmp = iter.next();
					if ((tmp.getKoleso().getDiametrkolesa() >= min) && (tmp.getKoleso().getDiametrkolesa() <= max)) {
						tmp.getKoleso().setTypshyny(Typshyny.ZYMOVI);
					}
				}
				break;
			}
			case 10: {
				System.out.println("¬вед≥ть м≥н≥мальний д≥аметр колеса");
				int min = sc.nextInt();
				System.out.println("¬вед≥ть максимальний д≥аметр колеса");
				int max = sc.nextInt();
				System.out.println("¬вед≥ть тип кузова");
				String k2 = sc.next();
				Typkyzova kyzov1 = Typkyzova.valueOf(k2.toUpperCase());
				Iterator<Car> iter = cars.iterator();
				while (iter.hasNext()) {
					Car tmp = iter.next();
					if ((tmp.getKoleso().getDiametrkolesa() >= min) && (tmp.getKoleso().getDiametrkolesa() <= max)
							&& (tmp.getKyzov().getTypkyzova() == kyzov1)) {
						iter.remove();
					}
				}
				break;
			}
//			case 11: {
//				System.out.println("¬вед≥ть тип кузова");
//				String k4 = sc.next();
//				Typkyzova kyzov1 = Typkyzova.valueOf(k4.toUpperCase());
//					ListIterator<Car> listIter = cars.listIterator(cars.size());
//				while (listIter.hasPrevious()) {
//					Car tmp = listIter.previous();
//					if (tmp.getKyzov().getTypkyzova() == kyzov1) {
//						System.out.println(tmp + " " + listIter.nextIndex());
//					}
//				}
//				break;
//			}
			case 12: {
				System.out.println("¬вед≥ть д≥аметр колеса");
				int diam = sc.nextInt();
				System.out.println("¬вед≥ть кол≥р кузова");
				String color1 = sc.next();
				Color color2 = Color.valueOf(color1.toUpperCase());
				System.out.println("¬вед≥ть тип шини");
				String shyna = sc.next();
				Typshyny typshyny = Typshyny.valueOf(shyna.toUpperCase());
				Iterator<Car> iter = cars.iterator();
				while (iter.hasNext()) {
					Car tmp = iter.next();
					if ((tmp.getKoleso().getDiametrkolesa() >= diam) && (tmp.getKyzov().getColor()==color2)) {
						tmp.getKoleso().setTypshyny(typshyny);
					}
				}
				break;
			}
			case 13: {
				System.out.println("¬вед≥ть м≥н≥мальний д≥аметр колеса");
				int min = sc.nextInt();
				System.out.println("¬вед≥ть максимальний д≥аметр колеса");
				int max = sc.nextInt();
				Iterator<Car> iter = cars.iterator();
				while (iter.hasNext()) {
					Car tmp = iter.next();
					if ((tmp.getKoleso().getDiametrkolesa() >= min) && (tmp.getKoleso().getDiametrkolesa() <= max)) {
						iter.remove();
					}
				}
				break;
			}
			case 14: {
				System.out.println("¬вед≥ть м≥н≥мальний д≥аметр колеса");
				int min = sc.nextInt();
				System.out.println("¬вед≥ть максимальний д≥аметр колеса");
				int max = sc.nextInt();
				System.out.println("¬вед≥ть тип шини");
				String shyna = sc.next();
				Typshyny typshyny = Typshyny.valueOf(shyna.toUpperCase());
				Iterator<Car> iter = cars.iterator();
				while (iter.hasNext()) {
					Car tmp = iter.next();
					if ((tmp.getKoleso().getDiametrkolesa() >= min) && (tmp.getKoleso().getDiametrkolesa() <= max)
							&& (tmp.getKoleso().getTypshyny()==typshyny)) {
						System.out.println(tmp);
					}
				}
				break;
			}
			case 15:
			{
				Iterator<Car> iter = cars.iterator();
			while(iter.hasNext()){
				Car tmp = iter.next();
				System.out.println(tmp);
				}
			break;
			}
			case 0:
				isRun = false;
				break;
			}

		}
	}

}
