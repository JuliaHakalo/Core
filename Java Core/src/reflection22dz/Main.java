package reflection22dz;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import reflection.Reflection;

public class Main {

	public static void main(String[] args) throws ReflectiveOperationException {
		Class<?> reflectionClass = Class.forName("reflection.Reflection");
		Field[] fields = reflectionClass.getDeclaredFields();
		for (Field field : fields) {
			System.out.println(field.getName()+" "+field.getType());
		}
		
		Object reflection = new Reflection("sghdfh", 1, true);
		Field nameField = reflectionClass.getDeclaredField("name");
		Field countField = reflectionClass.getDeclaredField("count");
		Field isRunField = reflectionClass.getDeclaredField("isRun");
		nameField.setAccessible(true);
		countField.setAccessible(true);
		isRunField.setAccessible(true);
		Object name = nameField.get(reflection);
		Object count = countField.get(reflection);
		Object isRun2 = isRunField.get(reflection);
		System.out.println(name+" "+count+" "+isRun2);
		Object reflection2 = reflectionClass.newInstance();
		nameField.set(reflection2, name);
		countField.set(reflection2, count);
		isRunField.set(reflection2, isRun2);
		System.out.println(reflection2);
		Method getName = reflectionClass.getMethod("getName");
		Method getCount = reflectionClass.getMethod("getCount");
		Method isRun = reflectionClass.getMethod("isRun");
		Method setName = reflectionClass.getMethod("setName", String.class);
		Method setCount = reflectionClass.getMethod("setCount", int.class);
		Method setRun = reflectionClass.getMethod("setRun", boolean.class);
		Object reflection3 = reflectionClass.newInstance();
		Object name1 = getName.invoke(reflection2);
		Object count1 = getCount.invoke(reflection2);
		Object isRun1 = isRun.invoke(reflection2);
		System.out.println(name1+" "+count1+" "+isRun1);
		setName.invoke(reflection3,name1);
		setCount.invoke(reflection3,count1);
		setRun.invoke(reflection3,isRun1);
		System.out.println(reflection3);
		
		Constructor[] constructors = reflectionClass.getConstructors();
		for (Constructor constructor : constructors) { 
		    Class[] paramTypes = constructor.getParameterTypes(); 
		    for (Class paramType : paramTypes) { 
		        System.out.print(paramType.getName() + " "); 
		    } 
		    System.out.println(); 
		} 
		
		
	}

}
