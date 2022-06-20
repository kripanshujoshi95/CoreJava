package GetterSetter;

public class Automobile {
	
	private String color;
	private String make;
	private int speed;
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
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void Break(int b) {
		speed = speed-b;
	}
	public void changeGear(int c) {
		speed = speed-c;
	}
	public void acceleration(int a) {
		speed = speed-a;
	}

}
