package MethodOverriding_Area;

public class Rectangle extends Shape {
	
	int length;
	int width;
	 
	public double area() {
		return length * width ;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
	
	
	
}
