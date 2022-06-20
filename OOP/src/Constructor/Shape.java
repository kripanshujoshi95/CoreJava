 package Constructor;

public class Shape {
	
	private String color= null;
	private int borderwidth =0;
	private String name = null;
	
	
	public Shape(String color, int borderwidth, String name) {
	
		this.color = color;
		this.borderwidth = borderwidth;
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public int getBorderwidth() {
		return borderwidth;
	}
	public String getName() {
		return name;
	}
	

	
	
	
	
}
