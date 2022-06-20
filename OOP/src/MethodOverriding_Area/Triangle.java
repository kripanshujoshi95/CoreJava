package MethodOverriding_Area;

public class Triangle extends Shape {
	int base;
	int heigth;
	
	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	@Override
	public double area() {
		return (base * heigth * 1/2);
	}

}
