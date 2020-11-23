package HarryPotter;

public class Employee extends Person {

	
	private String office = "Blvrd Vitosha 27";
	private double salary = 1000;
	private java.util.Date dateCreated = new java.util.Date();
	
	
	
	public String toString() {
		return super.toString() + "\nSalary: " + salary + ";\nOffice: " + office + ";\nHired on: " + dateCreated;
	}

	
	
}
