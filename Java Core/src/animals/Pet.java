package animals;

public class Pet {
	int age;
	String name;
	int golod;
	String food;

	Pet(String name, int age, int golod) {
		this.name = name;
		this.age = age;
		this.golod = golod;
	}

	void pr() {
		System.out.println();
		if (golod >= 90 && golod <= 100) {
			System.out.println(name +" - I want to go for a walk!");
			run();
		} else if (golod <= 10 && golod >= 0) {
			System.out.println(name +" - Please, give me some food!");
			eat();
		} else {
			System.out.println(name +" - I feel good!");
		}
	}

	void run() {
		golod = golod - 10;
		System.out.println("........");
		System.out.println("Nice journey!");
		System.out.println();
	}

	void eat() {
		golod = golod + 10;
		System.out.println("........");
		System.out.println("That was very tasty!");
		System.out.println();
	}
}
