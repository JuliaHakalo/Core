package salary;

public class Main {

	public static void main(String[] args) {
		Worker1 worker1 = new Worker1(2,100); 
        Worker2 worker2 = new Worker2(15,50); 
        System.out.println("������ ��������� ������ " + worker1.getSalary() + " ������.");
        System.out.println("������ ��������� ������ " + worker2.getSalary() + " ������.");
	}
	
}
