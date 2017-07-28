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
			System.out.println("� ���� ���������� �������� ��� ������ ������!");
			System.out.println("������ ������� - " + res + " km");
			System.out.println("��������� ����� - " + zprobig);
			vfuel = vfuel - ((consumption * km) / 100);
			System.out.println("ϳ��� ������ ���������� �� " + vfuel + " �");
			System.out.println("�� ������ �� ������� " + res + " km");

		} else if (km > res && vfuel >= 1) {
			System.out.println("����������� �������� ��� ������ ������!");
			System.out.println("������ ������ � ������� - " + res + "km");
			System.out.println("��������� ����� - " + zprobig);
			vfuel = Math.abs(vfuel - ((consumption * km) / 100));
			System.out.println("��� ������ ������ ������� �� " + vfuel + " �");
			vfuel = 0;
			System.out.println("��� ���� ������� �� " + (maxv - vfuel) + " �");
		} else if (vfuel == 0) {
			System.out.println("��������� ��������� ������!");
			System.out.println("��� ���� ������ ������� " + (consumption * km) / 100 + " �");
		}
		System.out.println();
	}

	void reFuel(int fuelVolume) {
		if (fuelVolume <= (maxv - vfuel)) {
			vfuel = vfuel + fuelVolume;
			System.out.println("����� � ���� " + vfuel + " �");
			System.out.println();
		} else {
			System.out.println("�� �� ������ ������ � ��� ���� ������� ������!");
			System.out.println();
		}

	}

	void fuel(){
		if(maxv-vfuel == 0){
			System.out.println("������ ���");	
		}
		else if (maxv-vfuel == maxv){
			System.out.println("������ ���");	
		}
		else System.out.println("����� � ���� " + vfuel + " �");
	}
	
	void distance() {
		System.out.println("���� ������ - " + color);
		System.out.println("�����  - " + brand);
		System.out.println("������  - " + consumption);
		System.out.println("��'�� ��������  - " + vfuel);
		System.out.println("����� - " + zprobig);
		System.out.println();
	}

}
