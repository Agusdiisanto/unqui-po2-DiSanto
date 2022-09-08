package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	
	double descuento;
	
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esCuidado) {
		super(nombre, precio, esCuidado);
	}
	
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esCuidado, double descuento) {
		super(nombre, precio, esCuidado);
		this.descuento = descuento;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento1) {
		this.descuento = descuento1;
	}
	
	public double realizarDescuento() {
		 return super.getPrecio() * (this.getDescuento() / 100);
	}
	
}
