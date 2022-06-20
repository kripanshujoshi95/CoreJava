package MethodOverriding_Area;

public class Circle extends Shape {
	int radius;
	
	public static double PI = 3.14;
	
	public double area() {
		return 3.14 * radius * radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	
	

} 
