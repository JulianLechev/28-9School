package pack;

public class CircleTest {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("Area of c1 is " + c1.getArea() + ". Perimeter of c1 is " + c1.getPerimeter());

		Circle c2 = new Circle(5);
		System.out.println("Area of c2 is " + c2.getArea() + ". Perimeter of c2 is " + c2.getPerimeter());

		c1.setRadius(10);
		System.out.println("Area of c1 is " + c1.getArea() + ". Perimeter of c1 is " + c1.getPerimeter());

	}

}
