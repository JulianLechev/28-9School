package HarryPotter;

public class Faculty extends Employee{

	private int officeHours = 12;
	private String rank = "Chemistry teacher";
	
	
	public String toString() {
		return super.toString() + ";\nOffice hours: " + officeHours + ";\nRank: " + rank;
	}
	
}
