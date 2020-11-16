package pack;

public class MyPointTest {

	public static void main(String[] args) {
		MyPoint mp1 = new MyPoint(4,5);
		MyPoint mp2 = new MyPoint(9,6);
		System.out.println(mp1.distance(5, 6));
		System.out.println(mp1.distance(mp1,mp2));
		System.out.println(mp2.distance(mp1,mp2));
	}

}
