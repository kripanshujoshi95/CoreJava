package Inheritance;

public class Circle extends Shape {
	private int radius;

	private static double PI = 3.14;

	public double area() {
		return PI * radius * radius;
	}
	public Circle() {}

	public Circle(int radius) {

		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

}
