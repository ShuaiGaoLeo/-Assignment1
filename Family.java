package s_n;
//auther:Shuai Gao
//Student number:s3596156

//Creating Subclass of the Couple class called Family

public class Family extends Couple {
	
	//COnstructor
	public Family(String father, String mother, String child) {
		super(father, mother, child);
	}
	
//Method to check if the child has parents in the Couple class and print their parents name
//Overrides family method in Couple class
	
	public void family(String cheak) {
		super.family(cheak);
		if (cheak.equals(super.getChild())) {
			super.printParent();
			System.out.println(super.getChild() + " is their child");

		}
	}
}
