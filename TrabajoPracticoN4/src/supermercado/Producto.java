package supermercado;

public class Producto {
	
	String nombre;
	double precio;
	boolean esCuidado = false;

	public Producto(String nombre, double precio) {
		
		this.nombre = nombre;
		this.precio = precio;
	}


	public Producto(String nombre, double precio, boolean esCuidado) {
		this(nombre, precio);
		this.esCuidado = esCuidado;
	}


	public String getNombre() {
		return nombre;
	}


	public double getPrecio() {
		return precio;
	}

	public boolean isEsCuidado() {
		return esCuidado;
	}


	public boolean esPrecioCuidado() {
		
		return this.isEsCuidado();
	}
	
	public void aumentarPrecio(double aumento) {

		this.precio = precio + aumento;
	}


	
	
	

}
