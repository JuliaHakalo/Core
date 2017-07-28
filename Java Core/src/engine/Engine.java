package engine;

public class Engine {
	String color, brand;
	int consumption, vfuel, maxv, probih;
	int zprobig, res;

	Engine(String color, String brand, int consumption, int vfuel, int maxv, int probih) {
		this.color = color;
		this.brand = brand;
		this.consumption = consumption;
		this.vfuel = vfuel;
		this.maxv = maxv;
		this.probih = probih;
	}


	void drive(int km) {
		res = ((100 * vfuel) / consumption);
		zprobig = probih + res;
		if (km < res) {
			System.out.println("У баці додстатньо пального для заданої поїздки!");
			System.out.println("Машина проїхала - " + res + " km");
			System.out.println("Загальний пробіг - " + zprobig);
			vfuel = vfuel - ((consumption * km) / 100);
			System.out.println("Після поїздки залишиться ще " + vfuel + " л");
			System.out.println("Ви можете ще проїхати " + res + " km");

		} else if (km > res && vfuel >= 1) {
			System.out.println("Недостатньо пального для заданої поїздки!");
			System.out.println("Машина змогла б проїхати - " + res + "km");
			System.out.println("Загальний пробіг - " + zprobig);
			vfuel = Math.abs(vfuel - ((consumption * km) / 100));
			System.out.println("Для заданої поїздки потрібно ще " + vfuel + " л");
			vfuel = 0;
			System.out.println("Бак може вмістити ще " + (maxv - vfuel) + " л");
		} else if (vfuel == 0) {
			System.out.println("Необхідно заправити машину!");
			System.out.println("Для вашої поїздки потрібно " + (consumption * km) / 100 + " л");
		}
		System.out.println();
	}

	void reFuel(int fuelVolume) {
		if (fuelVolume <= (maxv - vfuel)) {
			vfuel = vfuel + fuelVolume;
			System.out.println("Зараз в баку " + vfuel + " л");
			System.out.println();
		} else {
			System.out.println("Ви не можете залити у бак таку кількість палива!");
			System.out.println();
		}

	}

	void fuel(){
		if(maxv-vfuel == 0){
			System.out.println("повний бак");	
		}
		else if (maxv-vfuel == maxv){
			System.out.println("пустий бак");	
		}
		else System.out.println("Зараз в баку " + vfuel + " л");
	}
	
	void distance() {
		System.out.println("Колір машини - " + color);
		System.out.println("Марка  - " + brand);
		System.out.println("Розхід  - " + consumption);
		System.out.println("Об'єм пального  - " + vfuel);
		System.out.println("Пробіг - " + zprobig);
		System.out.println();
	}

}
