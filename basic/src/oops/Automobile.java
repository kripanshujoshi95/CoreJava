package oops;

public class Automobile {
	private String color;
	private int speed;
	private String make;
	
	
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	
	public int getspeed() {
		return speed;
	}
	
	public void setSpeed(int speed) {
		this.speed= speed;
	}
	public void Break (int b) {
		speed = speed-b;
	}
	public void ChangeGear (int c) {
		speed = speed-c;
	}
	public void acceleration (int a) {
		speed = speed-a;
	}
		
	}
	
	


