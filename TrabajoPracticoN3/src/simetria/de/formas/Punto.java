package simetria.de.formas;

public class Punto {
	
	int x;
	int y;
	
	public Punto() {}

	public Punto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void moverPuntoAPosicion(int x,int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void sumarUnPunto(Punto puntoASumar) {
		this.y = y + puntoASumar.getY();
		this.x = x + puntoASumar.getX();
	}
	

}
