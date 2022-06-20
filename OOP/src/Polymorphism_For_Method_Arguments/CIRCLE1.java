package Polymorphism_For_Method_Arguments;

public class CIRCLE1 extends SHAPE1{
	
    double radius;

    public static double PI=3.14;
    
	public CIRCLE1(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
    public double area() {
    return 3.14 * radius *radius;
	
    }
	
}
