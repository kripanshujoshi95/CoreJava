package Polymorphism_In_Arrays;

public class TRIANGLE extends SHAPE{
	
	int base;
	int height;
	public TRIANGLE(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public int getHeight() {
		return height;
	}
	public Double area() {
		return (double) (base * height /2);
	}

}
