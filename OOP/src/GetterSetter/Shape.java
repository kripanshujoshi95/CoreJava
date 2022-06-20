package GetterSetter;

public class Shape {
	private String color ;                             //color  = global
	private String borderWidth;
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;                            //this.color = local
	}
	public String getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(String borderWidth) {
		this.borderWidth = borderWidth;
	}
	

}
