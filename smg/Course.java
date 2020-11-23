package pack;

public class Course {

	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents=0;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName(){
		return courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	
	public void dropStudent(String student) {
		for(int i=0; i < 100; i++) {
			if(students[i] == student) {
				for(int y = 0; y < 99; y++) {
					String swap = students[i];
					students[i] = students[i+1];
					students[i+1] = swap;
					
						students[100] = null;
				
			}
			break;
			}
		}
	}
	
	
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	public String[] getStudents() {
		return students;
	}
	
}
