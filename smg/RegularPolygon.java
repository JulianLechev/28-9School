package pack;

public class RegularPolygon {

	private int n = 3;
	private double sideLenght = 1;
	private double x = 0;
	private double y = 0;
	
	public RegularPolygon() {
		
	}
	
	public RegularPolygon(int n, double sideLenght) {
		this.n = n;
		this.sideLenght = sideLenght;
	}
	public RegularPolygon(int n, double sideLenght, double x, double y) {
		this.n = n;
		this.sideLenght = sideLenght;
		this.x = x;
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSideLenght() {
		return sideLenght;
	}

	public void setSideLenght(double sideLenght) {
		this.sideLenght = sideLenght;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double getPerimeter() {
		return sideLenght * n;
	}
	
	public double getArea() {
		return (n*sideLenght*sideLenght)/(4*(180/n));
	}
	
}
