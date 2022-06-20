package Constructor;

public class Constructor {
	private String color = null;
	private int borderwidth = 0;

	public Constructor() {
		System.out.println("This is default Constructor ...");
	}

	public Constructor(String color, int borderwidth) {

		
		this.color = color;
		this.borderwidth = borderwidth;
	}

	public String getColor() {
		return color;
	}

	public int getborderwidth() {
		return borderwidth;
	}

}
