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
		System.out.println("������ 1 ��� ������ Person");
		System.out.println("������ 2 ��� �������� ��� Person");
		System.out.println("������ 3 ��� �������� ��� Person �� ������");
		System.out.println("������ 4 ��� �������� Person �� ����");
		System.out.println("������ 5 ��� �������� Person �� ������");
		int a=sc.nextInt();
		switch (a) {
		case 1:
			System.out.println("������ ��'�");
			String name = sc.next();
			System.out.println("������ ��");
			int age = sc.nextInt();
			System.out.println("������ �����");
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
				System.out.println("������ �����");
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
			System.out.println("������ ��������� �� ��� ���������");
			int min= sc.nextInt();
			System.out.println("������ ������������ �� ��� ���������");
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
			System.out.println("������ �����");
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