package inheritance1;

public class Triangle1 extends Shape1{
int base;
int height;

public double area(){
	return base * height*2;
	
}

public int getBase() {
	return base;
}

public void setBase(int base) {
	this.base = base;
}

public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}
}
