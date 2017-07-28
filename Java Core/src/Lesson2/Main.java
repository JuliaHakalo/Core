package Lesson2;

public class Main {

	public static void main(String[] args) {
		Human human = new Human();
		human.age = 18;
		human.name = "Ivan";
		human.printData();
		human.run();
		Human human2 = new Human("Jakub", 23);
		System.out.println(human2);
		human2.printData();
		human2.run();
	}

}
