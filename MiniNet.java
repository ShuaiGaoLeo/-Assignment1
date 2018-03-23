package s_n;
//author:Vijeta Tulsiyan
//Student number:s3398979

import java.util.Scanner;

//Main class MiniNet
public class MiniNet {
	
	//Main method
	public static void main(String[] args) {

		//Import pre-inputted data
		new ImportData();
//Display main menu option
		int option;
		Menu.display_menu();
		Scanner reader = new Scanner(System.in);
		Scanner reader1 = new Scanner(System.in);
		Scanner reader1_1 = new Scanner(System.in);
		//do-while loop for inputting menu option
		
		do {// do while for menu
			option = reader.nextInt();
			switch (option) {
			case 0:
				break;
				
			case 1://Add a person
				new AddPerson().addPerson();
				break;
				
			case 2://Select a person to view or update or delete person
				System.out.println("Which person would you want to Select?");
				String p = reader1.nextLine();
				int id = new LookUp().lookUp(p);
				//Sub menu with another options
				Menu.display_menu1();
				int option1;
				do {
					option1 = reader.nextInt();

					switch (option1) {
					case 1://display selected person's details
						System.out.println("Display the profile of selected peroson?");
						System.out.println("First Name: " + AddPerson.per[id].getFname());
						System.out.println("Last Name: " + AddPerson.per[id].getLname());
						System.out.println("Gender: " + AddPerson.per[id].getSex());
						System.out.println("Age: " + AddPerson.per[id].getAge());
						System.out.print("friends: ");
						for (int t = 0; t < AddRelation.numre; t++) 
							AddRelation.re[t].checkFriend(AddPerson.per[id].getFname());
						System.out.println();
						break;

					case 2:// update person's details
						//another sub menu for updating details to give option as to what to update
						Menu.display_menu1_1();
						int option1_1;
						do {
							option1_1 = reader1.nextInt();

							switch (option1_1) {
							case 1://change name
								System.out.println("Input the name want change to:");

								String name_c = reader1_1.nextLine();

								AddPerson.per[id].setFname(name_c);
								System.out.println(" Name has changed to: " + name_c);
								break;
							case 2://change age
								System.out.println("Input the age want change to:");
								int age_c = reader1_1.nextInt();
								AddPerson.per[id].setAge(age_c);
								System.out.println(" Age has changed to: " + age_c);

								break;
							case 3://change gender
								System.out.println("Input the Gender want change to:");
								int Gender_c = reader1_1.nextInt();
								AddPerson.per[id].setSex(Gender_c);
								System.out.println(" Gender has changed to: " + Gender_c);
								break;
							case 4://change picture
								System.out.println("Input the picture want change to: true or false");
								boolean image_c = reader1_1.nextBoolean();
								AddPerson.per[id].setImage(image_c);
								System.out.println(" Picture has changed to: " + image_c);
								break;
							case 5://change status
								System.out.println("Input the Status want change to:");
								String status_c = reader1_1.nextLine();
								AddPerson.per[id].setStatus(status_c);
								System.out.println(" Status has changed to: " + status_c);
								break;
							case 0://stop
								break;
							default:
								System.out.println("Invalid option.");
							}
							System.out.println();
							if (option1_1 != 0)
								Menu.display_menu1_1();
						} while (option1_1 != 0);
						break;
					case 3://delete person
						AddPerson.per[id] = null;
						option1 = 0;
						break;
						
					case 0://stop
						break;
					default:
						System.out.println("Invalid option.");
					}
					System.out.println();
					if (option1 != 0)
						Menu.display_menu1();
				} while (option1 != 0);
				break;
			case 3://for displaying person's family
				System.out.println("Which person would you want to display");
				String cheakParent = reader1.nextLine();
				for (int i = 0; i < AddRelation.numre; i++) 
					AddRelation.re[i].family(cheakParent);
				break;
			case 4://Add two person as a friend
				System.out.println("Entry first person's name");
				String firstFriend = reader1.nextLine();
				System.out.println("Entry another person's name");
				String secondFriend = reader1.nextLine();
				new AddRelation(firstFriend, secondFriend);
				System.out.println("They are added as friends");
				break;
			case 5://check if friends
				System.out.println("Please Enter name of an Adult to check if they are Direct friends");
				System.out.print("First Adult is: ");
				String friend1 = reader1.nextLine();
				System.out.print("Second Adult is: ");
				String friend2 = reader1.nextLine();
				String outP="1";
				for (int i = 0; i <= AddRelation.numre; i++) {
					if(i < AddRelation.numre) {
					outP=AddRelation.re[i].friend(friend1, friend2);
					if(outP.equals("3")) {
						System.out.println(friend1+" and "+friend2+" are  couple");
						break;
					}else if(outP.equals("2")) {
						System.out.println(friend1+" and "+friend2+" are  friend");
						break;
					}
					
					}else if(i==AddRelation.numre){
						
					System.out.println(friend1+" and "+friend2+" are not friend");
					
						}
					}
				
				break;
			case 6://display all items 
				int j = 0;
				for (int i = 0; i < Person.max; i++) {

					if (!(AddPerson.per[i] instanceof Person)) {
						j = j - 1;
					} else {
						System.out.println("Number " + (j + 1) + ": ");
						System.out.println("First Name: " + AddPerson.per[i].getFname());
						System.out.println("Last Name: " + AddPerson.per[i].getLname());
						System.out.println("Gender: " + AddPerson.per[i].getSex());
						System.out.println("Age: " + AddPerson.per[i].getAge());
						System.out.println("Status: " + AddPerson.per[i].getStatus());
						System.out.println("Picture: " + AddPerson.per[i].isImage());
						System.out.print("friends: ");
						for (int t = 0; t < AddRelation.numre; t++) { 
							AddRelation.re[t].checkFriend(AddPerson.per[i].getFname());
						}
						System.out.println();
						System.out.println();
					}
					j++;
				}
				break;

			default:
				System.out.println("Invalid option.");
			}
			System.out.println();
			if (option != 0)
				Menu.display_menu();

		} while (option != 0);
	}

}
