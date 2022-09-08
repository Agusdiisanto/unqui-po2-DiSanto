package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	
	String nombre;
	String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	

	public Supermercado(String nombreDeSupermercado, String direccionDeSupermercado) {
		this.nombre = nombreDeSupermercado;
		this.direccion = direccionDeSupermercado;
	}


	public List<Producto> getProductos() {
		return productos;
	}
	
	public void agregarProducto(Producto productoAgregar) {
		productos.add(productoAgregar);
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	
	public double getPrecioTotal() {
		double precioTotal = 0;
		
		for (Producto producto : productos) {
			precioTotal = precioTotal + producto.getPrecio();
		}
		return precioTotal;
	}
	
}
