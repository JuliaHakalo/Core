package salary;

public class Main {

	public static void main(String[] args) {
		Worker1 worker1 = new Worker1(2,100); 
        Worker2 worker2 = new Worker2(15,50); 
        System.out.println("Перший працівник отримує " + worker1.getSalary() + " доларів.");
        System.out.println("Другий працівник отримує " + worker2.getSalary() + " доларів.");
	}
	
}
