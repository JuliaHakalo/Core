package reflection;

public class Main {

	public static void main(String[] args) throws ReflectiveOperationException{
		Class<?> rectangleClass = Class.forName("less9.Rectangle");
	//	Class rectangleClass = myObj.getClass(); 
		Class superclass = rectangleClass.getSuperclass(); 
	}
}
