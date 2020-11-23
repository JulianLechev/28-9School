package HarryPotter;

public class GOTest {

	public static void main(String[] args) {
		Triangle tr = new Triangle(3, 4, 5);
		tr.setColor("blue");
		tr.setFilled(true);
		System.out.println(tr.printTriangle());
		System.out.println("\nThe area is " + tr.getArea() + ", the perimeter is " + tr.getPerimeter());
	}

}
