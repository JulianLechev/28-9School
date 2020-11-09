package pack;

public class RPTest {

	public static void main(String[] args) {
		
		RegularPolygon rp1 = new RegularPolygon();
		System.out.println(rp1.getArea() + " \n " + rp1.getPerimeter());

		RegularPolygon rp2 = new RegularPolygon(6,4);
		System.out.println(rp2.getArea() + " \n " + rp2.getPerimeter());

		RegularPolygon rp3 = new RegularPolygon(10,4,5.6,7.8);
		System.out.println(rp3.getArea() + " \n " + rp3.getPerimeter());
	}

}
