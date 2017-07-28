package robot;

public class Main {

	public static void main(String[] args) {
		Robot r1 = new Robot();
		r1.work();
		CoffeRobot r2 = new CoffeRobot();
		r2.work();
		RobotDancer r3 = new RobotDancer();
		r3.work();
		RobotCooker r4 = new RobotCooker();
		r4.work();
	}

}
