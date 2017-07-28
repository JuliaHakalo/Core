package zooclub;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

import less11.Gender;
import less11.Person;

public class Main {

	public static void main(String[] args) throws IOException {
		Zooclub club = new Zooclub(new HashMap<>());
		boolean isRun = true;

		while (isRun) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1 - Додати учасника клубу ");
			System.out.println("2 - Додати тваринку до учасника клубу  ");
			System.out.println("3 - Видалити тваринку з учасника клубу");
			System.out.println("4 - Видалити учасника клубу ");
			System.out.println("5 - Видалити конкретну тваринку зі всіх власників   ");
			System.out.println("6 - Вивести на екран зооклуб ");
			System.out.println("7 - Дописати в блокнот ");
			System.out.println("8 - Перезаписати в блокнот ");
			System.out.println("9 - Зчитати з блокноту на консоль ");
			System.out.println("10 - Серіалізація");
			System.out.println("11 - Десеріалізація");
			System.out.println("anykey - вийти з програми");
			int a = sc.nextInt();
			switch (a) {
			case 1: {
				System.out.println("Enter person name");
				String personName = sc.next();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Enter gender");
				Gender gender = Gender.valueOf(sc.next().toUpperCase());
				Person person = new Person(personName, age, gender);
				if (!club.getMap().containsKey(person)) {
					club.getMap().put(person, new ArrayList<>());
				}

			}
				break;
			case 2: {
				System.out.println("Enter person name");
				String personName = sc.next();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Enter gender");
				Gender gender = Gender.valueOf(sc.next().toUpperCase());
				Person person = new Person(personName, age, gender);
				if (!club.getMap().containsKey(person)) {
					club.getMap().put(person, new ArrayList<>());
				}
				System.out.println("Введіть імя тваринки ");
				String name = sc.next();
				System.out.println("Введіть вік тваринки ");
				int aget = sc.nextInt();
				Pet pet = new Pet(name, aget);
				club.getMap().get(person).add(new Pet(name, aget));
			}
				break;
			case 3: {
				System.out.println("Enter person name");
				String personName = sc.next();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Enter gender");
				Gender gender = Gender.valueOf(sc.next().toUpperCase());
				Person person = new Person(personName, age, gender);
				if (!club.getMap().containsKey(person)) {
					club.getMap().put(person, new ArrayList<>());
				}
				System.out.println("Введіть імя тваринки ");
				String name = sc.next();
				System.out.println("Введіть вік тваринки ");
				int aget = sc.nextInt();
				Pet pet = new Pet(name, aget);
				club.getMap().get(person).remove(new Pet(name, aget));
			}

				break;
			case 4: {
				System.out.println("Enter person name");
				String personName = sc.next();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Enter gender");
				Gender gender = Gender.valueOf(sc.next().toUpperCase());
				Person person = new Person(personName, age, gender);
				if (club.getMap().containsKey(person)) {
					club.getMap().remove(person, new ArrayList<>());
				}
			}
				break;
			case 5: {
				System.out.println("Введіть імя тваринки ");
				String name = sc.next();
				System.out.println("Введіть вік тваринки ");
				int aget = sc.nextInt();
				Pet pet = new Pet(name, aget);
				Set<Person> keySet = club.getMap().keySet();
				for (Person key : keySet) {
					for (Pet person : club.getMap().get(key)) {
						club.getMap().get(person).remove(new Pet(name, aget));
					}
				}
			}

				break;
			case 6: {
				System.out.println(club.getMap());
			}
				break;
			case 7: { // Дописати в блокнот
				System.out.println("Enter person name");
				String personName = sc.next();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Enter gender");
				Gender gender = Gender.valueOf(sc.next().toUpperCase());
				Person person = new Person(personName, age, gender);
				System.out.println("Введіть імя тваринки ");
				String name = sc.next();
				System.out.println("Введіть вік тваринки ");
				int age1 = sc.nextInt();
				Pet pet = new Pet(name, age1);
				try(FileWriter writer = new FileWriter(new File("notebook.txt"), true)){
					writer.append(person.getName()+" "+person.getAge()+" "+person.getGender()+"has animal: "+pet.getName()+" "+pet.getAge()+"\n");
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
				break;
			case 8: { // Перезаписати в блокнот
				System.out.println("Enter person name");
				String personName = sc.next();
				System.out.println("Enter age");
				int age = sc.nextInt();
				System.out.println("Enter gender");
				Gender gender = Gender.valueOf(sc.next().toUpperCase());
				Person person = new Person(personName, age, gender);
				System.out.println("Введіть імя тваринки ");
				String name = sc.next();
				System.out.println("Введіть вік тваринки ");
				int age1 = sc.nextInt();
				Pet pet = new Pet(name, age1);
				try(FileWriter writer = new FileWriter(new File("notebook.txt"), false)){
					writer.append(person.getName()+" "+person.getAge()+" "+person.getGender()+"has animal: "+pet.getName()+" "+pet.getAge()+"\n");
				}catch (IOException e) {
					e.printStackTrace();
				}
			}
				break;
			case 9: { // Зчитати з блокноту на консоль
				try(Scanner sc1 = new Scanner(new File("notebook.txt"))){
				while(sc1.hasNextLine()){
					String line = sc1.nextLine();
					if(!line.isEmpty()){
						String[] array = line.split(" ");
						Pet pet1 = new Pet(array[0], Integer.valueOf(array[1]));
						System.out.println(pet1);
					}
				}
			}catch (IOException e) {
				e.printStackTrace();
			}
			}
				break;
			case 10:{
				OutputStream os = null;
				ObjectOutputStream oos = null;
				try{
					os = new FileOutputStream(new File("note.nt"));
					oos = new ObjectOutputStream(os);
					oos.writeObject(club);
				}catch (IOException e) {
					e.printStackTrace();
				}finally {
					if(oos!=null){
						try {
							oos.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					if(os!=null){
						try {
							os.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
				}
			}
			break;
			case 11:{
				try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("note.nt")))){
					club = (Zooclub)ois.readObject();
					System.out.println(club.getMap());
				}catch (IOException | ClassNotFoundException e) {
					e.printStackTrace();
				}
			}
			break;
			default:
				isRun = false;
				break;

			}

		}
	}
}
