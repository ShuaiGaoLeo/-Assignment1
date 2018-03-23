package s_n;
//author:Shuai Gao
//Student number:s3596156
//Creating class to add count and add relationship

public class AddRelation {
	protected static int numre; // count the relationship number
	protected static Relationship re[] = new Relationship[100];
	// protected static Relationship 
	
	//Method to add to person to the Friendship after checking their age and age difference

	public AddRelation(String name1, String name2) {
		int n1 = new LookUp().lookUpAge(name1);// search input in list get identifier
		int n2 = new LookUp().lookUpAge(name2);

		if (n1 > 2 && n2 > 2) {// judge age
			if (n1 < 16 && n2 < 16) {
				if (((n1 - n2) ^ 2) < 9) {
					re[numre] = new FriendShip(name1, name2);// create friend for children

				} else {
					System.out.println("two child can't be friend without age more than 3 years");
				}
			} else if (n1 > 16 && n2 > 16) {
				re[numre] = new FriendShip(name1, name2);// create friend for adult

			} else {
				System.out.println("children can't be friends with adults");
			}
		}

	}

	//Method to create family of father, mother and child after checking their gender and age
	public AddRelation(String name1, String name2, String name3) {

		int x = 3;
		int y = 4;

		x = new LookUp().lookUpSex(name1);
		y = new LookUp().lookUpSex(name2);
		if (x == y) {
			System.out.println("father and mother must with differend gender!");
		} else {
			// compare age of parents
			if (new LookUp().lookUpAge(name1) < 16 && new LookUp().lookUpAge(name2) < 16) {
				System.out.println("father and mother must greater 16!");
			} else {
				// create family
				re[numre] = new Family(name1, name2, name3);

			}
		}
	}
}
