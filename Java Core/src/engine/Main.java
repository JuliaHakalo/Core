package engine;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean isRun = true;
		while (isRun){
			Scanner sc = new Scanner(System.in);
			System.out.println("1 - подивитися скільки пального в баці");
			System.out.println("2 - розрахувати чи вистарчить пального на подорож");
			System.out.println("3 - подорож");
			System.out.println("4 - заправити машину");
			System.out.println("5 - інформація про машину");
			int a = sc.nextInt();
			switch(a){
			
			}
		}
//		Engine e1 = new Engine("white", "Mercedes", 10, 10, 80, 7700);
//
//		e1.drive(10);
//		e1.reFuel(40);
//		e1.distance();
//
//		Engine e2 = new Engine("red", "Fiat", 4,30,50,10000);
//		e2.drive(50);
//		e2.reFuel(10);
//		e2.distance();
//
//		Engine e3 = new Engine("yellow", "Renault", 6,0,60,8000);
//		e3.drive(700);
//		e3.reFuel(150);
//		e3.distance();
	}

}
