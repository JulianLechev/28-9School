package HarryPotter;

public class ChildrensBook extends Book{

	private int age;
	
	
	public ChildrensBook(double regularPrice, String publisher, int yearPublished, int age) {
		super(regularPrice, publisher, yearPublished);
		this.setAge(age);
	}

	public double computeSalePrice(){
        return super.getRegularPrice() * 0.3;
    }

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
