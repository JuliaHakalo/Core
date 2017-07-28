package less11;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Boolean isRun = true;
		
		List <Person> strings = new ArrayList<>();
		while(isRun){
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть 1 щоб додати Person");
		System.out.println("¬вед≥ть 2 щоб показати вс≥х Person");
		System.out.println("¬вед≥ть 3 щоб видалити вс≥х Person за статтю");
		System.out.println("¬вед≥ть 4 щоб видалити Person за в≥ком");
		System.out.println("¬вед≥ть 5 щоб видалити Person за буквою");
		int a=sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("¬вед≥ть ≥м'€");
			String name = sc.next();
			System.out.println("¬вед≥ть в≥к");
			int age = sc.nextInt();
			System.out.println("¬вед≥ть стать");
			String input = sc.next();
			Gender gender = Gender.valueOf(input.toUpperCase());
			Person person = new Person(name, age, gender);
			strings.add(person);
			break;
		case 2:
			{
				Iterator<Person> iter = strings.iterator();
			while(iter.hasNext()){
				Person tmp = iter.next();
				System.out.println(tmp);

				}
			}
		break;
		case 3:
			{
				System.out.println("¬вед≥ть стать");
			String gender1= sc.next();
			Gender gender2 = Gender.valueOf(gender1.toUpperCase());
			Iterator<Person> iter = strings.iterator();
			while(iter.hasNext()){
				Person tmp = iter.next();
				if (tmp.getGender()==gender2){
					iter.remove();
				}
				}
			}
			break;
		case 4:{
			System.out.println("¬вед≥ть м≥н≥мальний в≥к дл€ видаленн€");
			int min= sc.nextInt();
			System.out.println("¬вед≥ть максимальний в≥к дл€ видаленн€");
			int max=sc.nextInt();
			Iterator<Person> iter = strings.iterator();
			while(iter.hasNext()){
				Person tmp = iter.next();
				if ((tmp.getAge()>=min)&&(tmp.getAge()<=max)){
					iter.remove();
				}
				}
		}
		case 5:
		{
			System.out.println("¬вед≥ть букву");
			String s = sc.next().toUpperCase();
			Iterator<Person> iter = strings.iterator(); 
			while(iter.hasNext()){
				Person tmp = iter.next();
				if ((tmp.getGender().name().contains(s))&&(tmp.getName().toUpperCase().contains(s))){
					iter.remove();
				}
				}
		}
		default:
			break;
		}

		}
	}
}