package Lesson2;

public class Zbyrach extends Hunter{
	int cherry = 0;
	
	Zbyrach (String name, int age) {
		super(name, age);
	}
	
	void eat() {
		run();
		cherry++;
		System.out.println(name + " eats" + cherry + " crerry");
	}
	@Override
	void run() {
		System.out.println(name + ": go!");
	}
}
