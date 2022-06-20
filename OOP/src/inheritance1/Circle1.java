package inheritance1;

public class Circle1 extends Shape1 {
	int radius;
	
	public static double PI=3.14;
	
	public double area(){
		return 3.14 * radius * radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	

}
