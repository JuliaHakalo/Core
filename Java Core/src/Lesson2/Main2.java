package Lesson2;

public class Main2 {

	public static void main(String[] args) {
		Hunter hunter = new Hunter();
		hunter.name = "Ivan";
		hunter.eat("bird meat");
		hunter.eat();
		hunter.walk();
		Human human = new Hunter();
		human.name = "Mykola";
		human.run();
		System.out.println(human);
		
		

	}

}
