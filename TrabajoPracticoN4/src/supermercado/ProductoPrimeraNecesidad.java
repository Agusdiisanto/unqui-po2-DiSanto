package supermercado;

public class ProductoPrimeraNecesidad extends Producto {

	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esCuidado) {
		super(nombre, precio, esCuidado);
	}
	
	public void realizarDescuento() {
		this.precio = precio * 0.9;
	}
	
}
