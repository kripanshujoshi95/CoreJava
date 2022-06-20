package inheritance1;

public class Rectangle1 extends Shape1{
	int length;
	int width;
	
	
	public Rectangle1(int i, int j) {
		length=i;
		width=j;
	}
	public double area() {
		return length * width;
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
