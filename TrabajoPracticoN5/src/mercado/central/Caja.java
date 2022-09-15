package mercado.central;

import java.util.ArrayList;
import java.util.List;

public class Caja {

	private List<AutoServicio> productosEnStock = new ArrayList<>();
	private List<AutoServicio> productosDelCliente = new ArrayList<>();
	
	
	public double montoAPagar() {
		 return productosDelCliente.stream().mapToDouble(p->p.abonarProducto()).sum();
	}
	
	public int cantidadDeProductos() {
		return productosEnStock.size();
	}
	
	public void addProducto(AutoServicio productoAgregar) {
		productosEnStock.add(productoAgregar);
	}
	
	public void registrarProducto(AutoServicio productoARegistrar) {
		productosDelCliente.add(productoARegistrar);
		productosEnStock.remove(productoARegistrar);
	}
	
	 
	
	
}
