package Polymorphism_In_Arrays;

public class RECTANGLE extends SHAPE{
	 
	int length;
	int width;
	public RECTANGLE(int length, int width) {
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
	
	public Double area() {
		return (double) (length * width);
	}
	
	

	
	
}
