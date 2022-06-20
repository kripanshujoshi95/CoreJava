package Polymorphism_In_Arrays;

public class CIRCLE extends SHAPE {
	
	double radius;

	public static double PI = 3.14;
	
	
	public CIRCLE(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}
	
		public Double area(){
			return 3.14 * radius * radius;
		}

}
