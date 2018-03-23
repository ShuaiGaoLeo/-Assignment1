package s_n;
//auther:Vijeta Tulsiyan
//Student number:s3398979
//Creating class to store persons' details in AddPerson and AddRelation class 
public class ImportData {

//Constructor
	public ImportData() {
		AddPerson.per[0] = new Adult("Kerry", "DSuza", 0, 24, "Doing Assignment", true);
		AddPerson.per[1] = new Adult("John", "Well", 1, 25, "Gamming", false);
		AddPerson.per[2] = new Adult("Abraham", "Lincoln", 1, 40, "Want to find a job", true);
		AddPerson.per[3] = new Adult("Lucy", "Bell", 0, 35, "Play with child", true);
		AddPerson.per[4] = new Adult("Kim", "Cat", 0, 28, "make up", true);
		AddPerson.per[5] = new Adult("Tom", "Machi", 1, 50, "watching tv", true);
		AddPerson.per[6] = new Adult("Shirley", "Verg", 0, 48, "chatting", true);
		AddPerson.per[7] = new Adult("Hard", "Rock", 1, 45, "sing a song", true);
		AddPerson.per[8] = new Adult("VJ", "Tulsi", 0, 31, "Working", true);
		AddPerson.per[9] = new Adult("Leo", "Gao", 1, 25, "Studing", true);

		AddPerson.per[10] = new Child("Jade", "DSuza", 1, 2, "I still young", true);
		AddPerson.per[11] = new Child("Bobby", "Lincoln", 1, 12, "crying", true);
		AddPerson.per[12] = new Child("Jasmine", "Machi", 0, 15, "play with himself", true);

		new AddRelation("John", "Kerry", "Jade");
		new AddRelation("Tom", "Shirley", "Jasmine");
		new AddRelation("Tom", "Shirley", "Bobby");

		new AddRelation("Leo", "VJ");
		new AddRelation("Leo", "Hard");
		new AddRelation("Lucy", "Hard");
		new AddRelation("Jade", "Bobby");
		new AddRelation("Kerry", "Shirley");

	}

}