package s_n;
//author:Shuai Gao	
//Student number:s3596156

import java.util.*;
//Creating class to add person to the person list

public class AddPerson {// for user to add person
	private String fname; // store data var
	private String lname;
	private String status;
	private int age;
	private int sex;
	private boolean image;
	protected static Person[] per = new Person[100]; // for create constractor

	protected static String[] list = new String[100]; // for look up object
	
	//Getter and setter methods for array List

	public static String getList(int x, int y) { 
		return list[x];
	}

	public static void setList(int no, String name) { // list setter

		list[no] = name;

	}

	//Method to input a person's details
	public void addPerson() { // add person method
		Scanner reader = new Scanner(System.in);
		Scanner reader2 = new Scanner(System.in);
		System.out.println("Please entry first name");
		this.fname = reader.nextLine();
		System.out.println("Please entry last name");
		this.lname = reader.nextLine();
		System.out.println("Please entry gender: male 1 female 0");
		this.sex = reader.nextInt();
		System.out.println("Please entry age");
		this.age = reader.nextInt();
		System.out.println("Please entry status");
		this.status = reader2.nextLine();
		System.out.println("Please entry Picture: true or false");
		this.image = reader2.nextBoolean();
		if (age > 16) { // compare age

			per[Person.max] = new Adult(fname, lname, sex, age, status, image);

		} else {
			Scanner reader1 = new Scanner(System.in);
			System.out.println("A Child must has parents, please entry father's name");
			String father = reader1.nextLine();
			System.out.println(" please entry mother's name");
			String mother = reader1.nextLine();
			AddRelation de = new AddRelation(father, mother, fname);//add family
			per[Person.max] = new Child(fname, lname, sex, age, status, image);

		}

	}
}
