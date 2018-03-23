package s_n;
//auther:Shuai Gao
//Student number:s3596156

//Creating Abstract class Relationship
public abstract class Relationship {
//instance variables to store names
	private String name1;
	private String name2;
	
	//Getters and Setters

	public String getName1() {
		return name1;
	}

	public void setName1(String name1) {
		this.name1 = name1;
	}

	public String getName2() {
		return name2;
	}

	public void setName2(String name2) {
		this.name2 = name2;
	}

	//Constructor
	public Relationship(String friend1, String friend2) {
		this.name1 = friend1;
		this.name2 = friend2;
		AddRelation.numre++;

	}

	//Abstract Method to add 2 names as friend
	public abstract String friend(String name1, String name2);

	//Abstract Method to add 2 names as family
	public abstract void family(String cheak);
	
	//Concrete Method to check if 2 names are friends
	public void checkFriend(String c) {
		if(name1.equals(c)) {
			System.out.print(name2+" ");
			
		}else if(name2.equals(c)) {
			System.out.print(name1+" ");
		}
		
	}
}
