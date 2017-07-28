package setcars;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

import newcar.Buttons;
import newcar.Car;
import newcar.Color;
import newcar.Kermo;
import newcar.Koleso;
import newcar.Kyzov;
import newcar.Typshyny;

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

	
	while(isRun){
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - �������, �� ����� �������� ���� ������ �� �������� ������ ������, ������ ��� ��� �� ��������. ");
		System.out.println("2 - �������� ������, ������ ����� ���� ������ � �������� �������. ");
		System.out.println("3 - ������ ������, �� ����� �������� ��� ��� �� ������ ���� ���� ������ � �������� �������. ");
		System.out.println("4 - �������� �� ������");
		System.out.println("0 - ����� � ��������");
		int q = sc.nextInt();
		switch (q) {
	case 1: {
		System.out.println("������ ������ ������");
		int diam = sc.nextInt();
		System.out.println("������ ���� ������");
		String color1 = sc.next();
		Color color2 = Color.valueOf(color1.toUpperCase());
		System.out.println("������ ��� ����");
		String shyna = sc.next();
		Typshyny typshyny = Typshyny.valueOf(shyna.toUpperCase());
		Iterator<Car> iter = cars.iterator();
		while (iter.hasNext()) {
			Car tmp = iter.next();
			if ((tmp.getKoleso().getDiametrkolesa() == diam) && (tmp.getKyzov().getColor()==color2)) {
				tmp.getKoleso().setTypshyny(typshyny);
			}
		}
		break;
	}
	case 2: {
		System.out.println("������ ��������� ������ ������");
		int min = sc.nextInt();
		System.out.println("������ ������������ ������ ������");
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
	case 3: {
		System.out.println("������ ��������� ������ ������");
		int min = sc.nextInt();
		System.out.println("������ ������������ ������ ������");
		int max = sc.nextInt();
		System.out.println("������ ��� ����");
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
	case 4:
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
