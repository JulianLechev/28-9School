package pack;

public class Fan {
	public int slow = 1;
	public int medium = 2;
	public int fast = 3;
	private int speed;
	private boolean isOn;
	private double radius;
	private String color;
	public Fan() {
		setSpeed(slow);
		setOn(false);
		setRadius(5);
		setColor("Blue");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	

	public boolean isOn() {
		return isOn;
	}

	public boolean setOn(boolean isOn) {
		this.isOn = isOn;
		return isOn;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		if(isOn==false) {
			return "The color is " + getColor() + ". The radius is " + getRadius() + ". The Fan is off.";
		}
		else {
			return "The color is " + getColor() + ". The radius is " + getRadius() + ". The speed is " + getSpeed() ;
		}
	}
	
	
}
