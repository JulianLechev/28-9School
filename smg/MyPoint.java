package pack;

public class MyPoint {
	public int x, y;

	public MyPoint(int x, int y) {
		this.x=x;
		this.y=y;
	}
	
	
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int distance(int a, int b) {
		int xOfVector = Math.abs(x-a);
		int yOfVector = Math.abs(y-b);
		double lenghtOfVector = Math.sqrt(yOfVector*yOfVector + xOfVector*xOfVector);
		return (int)lenghtOfVector;
	}
	public static int distance (MyPoint mp1, MyPoint mp2) {
		
		return (int)Math.sqrt((Math.abs(mp1.x-mp2.x)*Math.abs(mp1.x-mp2.x) + Math.abs(mp1.y-mp2.y)*Math.abs(mp1.y-mp2.y)));
	}
	
	
}
