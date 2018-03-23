package s_n;
//author:Vijeta Tulsiyan
//Student number: s3398979

import java.util.*;

public class Menu {
	
	//Static methods to display menu
	//Main menu method

	public static void display_menu() {

		System.out.println("MAIN MENU");
		System.out.println("(1) - Add a peroson");
		System.out.println("(2) - Select a person");
		System.out.println("(3) - Find out the name(s) of a person¡¯s child(ren) or the names of the parents ");
		System.out.println("(4) - Connect two persons in a meaningful way ");
		System.out.println("(5) - Check if two adults are direct friends");
		System.out.println("(6) - List all Person's Profiles");
		System.out.println("(0) - Exit");
		System.out.println("Please Choose an option between 0-5");
	}
//Sub menu method
	public static void display_menu1() {
		//sub menu
		System.out.println("MENU Select");
		System.out.println("(1) - List his/her Profiles");
		System.out.println("(2) - Updata his/her profiles");
		System.out.println("(3) - Delete this person");
		System.out.println("(0) - Exit of Select person");
	}
//Sub Menu method
	public static void display_menu1_1() {
		//sub menu
		System.out.println("MENU Update");
		System.out.println("(1) - Update Name");
		System.out.println("(2) - Update Age");
		System.out.println("(3) - Update Gender");
		System.out.println("(4) - Update Picture");
		System.out.println("(5) - Update Status");
		System.out.println("(0) - Exit of Select person");
	}

}