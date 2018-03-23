package s_n;
//author:Shuai Gao
//Student number:s3596156

//Creating Subclass for Abstract class Relationship
public class FriendShip extends Relationship {
	
//Constructors to store friends
	public FriendShip(String friend1, String friend2) {
		super(friend1, friend2);
	}

	public String friend(String name1, String name2) {//method for check if friends

		if (((super.getName1().equals(name1)) && (super.getName2().equals(name2)))
				|| (((super.getName2()).equals(name1)) && ((super.getName1()).equals(name2)))) {
			return "2";
			

		}else {
			return "1";
		}

	}

	//Override method in abstract class to check if a person has a family or are couple
	public void family(String check) {
		if (check.equals(super.getName1()) || check.equals(super.getName2())) {
			System.out.println(check + " dont't have family or couple");
		}

	}
}
