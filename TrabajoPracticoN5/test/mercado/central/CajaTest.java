package mercado.central;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import servicios.Servicio;

public class CajaTest {
	
	Caja caja1;
	AutoServicio producto1;
	AutoServicio producto2;
	AutoServicio producto3;
	AutoServicio servicio1;
	AutoServicio servicio2;

	
	@BeforeEach
	public void setUp() {
		
		caja1 = new Caja();
		producto1 = new Producto(34.5);
		producto2 = new Producto(15.5);
		producto3 = new ProductoDeCooperativa(54,10);
		servicio1 = new Servicio(200,100);
		servicio2 = new Servicio(10,10);
		
		caja1.addProducto(producto1);
		caja1.addProducto(producto2);
		caja1.addProducto(servicio2);
		caja1.addProducto(servicio1);
	} 
	 
	
	@Test
	public void unaCajaSabeLaCantidadDeProductosQueHay() {
		assertEquals(4, caja1.cantidadDeProductos());
	}
	
	
	@Test
	public void unaCajaSabeElMontoTotalDeLosProductosDelCliente() {
		caja1.registrarProducto(servicio1);
		caja1.registrarProducto(producto1);
		assertEquals(20034.5, caja1.montoAPagar());
	}
	
	@Test
	public void unProductoTieneUnDescuentoAplicado() {
		caja1.registrarProducto(servicio1);
		caja1.registrarProducto(producto1);
		assertEquals(20034.5, caja1.montoAPagar());
	}
	
	@Test
	public void unaCajaSabeElMontoDeProductoCooperativa() {
		caja1.registrarProducto(producto1);
		assertEquals(34.5, caja1.montoAPagar());
	}
	

	
	
}
