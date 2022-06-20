package Polymorphism_For_Method_Arguments;

public class RECTANGLE1 extends SHAPE1 {
	int length;
	int width;
	
	public RECTANGLE1(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}
	

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

	
	public double area() {
		return length * width;
	}
	
}
