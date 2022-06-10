package Inheritance;

public class Triangle {
	
	private int base;
	private int heigth;
	
	public double area() {
		return (base * heigth * 1/2);
		
		
	}

	public Triangle(int base, int heigth) {
		this.base = base;
		this.heigth = heigth;
	}

	public int getBase() {
		return base;
	}

	public int getHeigth() {
		return heigth;
	}
	 

}
