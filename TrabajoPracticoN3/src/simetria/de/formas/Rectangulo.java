package simetria.de.formas;

public class Rectangulo {
	
	private int base;
	private int height;
	
	public Rectangulo(int b, int h) {
		base  = b;
		height = h;
	}
	
	public int getArea() {
		return base * height;
	}
	
	public int getPerimeter() {
		return 2 * base + 2 * height;
	}
	
	public boolean isHorizontal() {
		return base > height;
	}
	
	public boolean isVertical() {
		return height > base;
	}
	
}
