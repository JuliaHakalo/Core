package Lesson2;

public class Hunter extends Human {
	int killedMammonts = 0;

	public Hunter(String name, int age) {
		super(name, age);
	}
	public Hunter() {
	
	}
	
	void eat() {
		run();
		killedMammonts++;
		System.out.println(name + ": I kill " + killedMammonts + " mammonts");
		eat("mammont eat");
	}

	void walk() {
		super.run();
	}

	@Override
	void run() {
		System.out.println(name + ": faster go-go-go!!!");
	}
	public String toString(){
		return "Hunter [name="+name+", age="+age+"]";
	}
}
