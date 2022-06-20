package Polymorphism_For_Method_Arguments;

public class TRIANGLE1 extends SHAPE1 {
	int base;
	int height;
	
	
	
	public TRIANGLE1(int base, int height) {
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
	
	public double area() {
		return (base * height /2);
	}

}
