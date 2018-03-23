package s_n;
//auther:Shuai Gao
//Student number:s3596156

//Creating Subclass of abstract class Relationship 

public class Couple extends Relationship {// class for store couple

	private String child;
	
	//2 Constructors for Couple class

	public Couple(String name1, String name2) {
		super(name1, name2);
	}

	public Couple(String father, String mother, String child) {
		this(father, mother);
		this.child = child;
	}

	//Getters and setters
	
	public String getChild() {// getter
		return child;
	}

	public void setChild(String child) {// setter
		this.child = child;
	}

	public void printParent() {// for child class print super var
		System.out.println("parents are " + super.getName1() + " and " + super.getName2());
	}

	// Method to check if the child belongs to him/her after checking gender
	
	public void family(String cheak) {// family check method

		if (cheak.equals(super.getName1())) {// compare input name1
			int gender1 = new LookUp().lookUpSex(super.getName1());
			if (gender1 == 1) {

				System.out.println(this.child + " is his child");
			} else if (gender1 == 0) {

				System.out.println(this.child + " is her child");
			}
		}

		if (cheak.equals(super.getName2())) {// compare input name2

			int gender1 = new LookUp().lookUpSex(super.getName2());
			if (gender1 == 1) {

				System.out.println(this.child + " is his child");
			} else if (gender1 == 0) {

				System.out.println(this.child + " is her child");
			}
		}

	}
	
	//Method to find if the person has a friend
	//Overrides method in Relationship class
	
	public void checkFriend(String c) {};
	
	//Method to check if two person are in the Relationship class
	
	public String friend(String name1, String name2) {// override friend for couple
		if (((super.getName1().equals(name1)) && (super.getName2().equals(name2)))
				|| (((super.getName2()).equals(name1)) && ((super.getName1()).equals(name2)))) {
			return "3";

		}else {
			return "1";
		}

	}
}
