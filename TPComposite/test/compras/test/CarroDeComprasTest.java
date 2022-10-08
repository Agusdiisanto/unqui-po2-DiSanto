package compras.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import compras.src.CarroDeCompras;
import compras.src.Product;
import compras.src.SpecialProduct;

public class CarroDeComprasTest {
	
	Product producto;
	Product producto1;
	Product producto2;
	
	SpecialProduct productoEspecial;
	SpecialProduct productoEspecial1;
	
	CarroDeCompras carrito;
	
	
	@BeforeEach
	
	public void setUp() {
		
		producto = new Product(9.1F, "CocaCola");
		producto1 = new Product(25.9F, "Pepsi");
		producto2 = new Product(100.9F, "Fanta");
		
		productoEspecial = new SpecialProduct(25000.5F, "AirPods");
		productoEspecial1 = new SpecialProduct(65000.9F, "Iphone");
		
		carrito = new CarroDeCompras();
	}
	
	@Test
	public void test01_unCarritoSabeElTotalDelPrecioRedondeado() {
		
		carrito.addElements(producto);
		carrito.addElements(producto1);
		
		assertTrue(carrito.getSetElements().contains(producto));
		assertTrue(carrito.getSetElements().contains(producto1));
		assertEquals(35F, carrito.total());
		
	}
	
	@Test
	public void test02_unCarritoSabeElTotalDelPrecioSinRedondear() {
		
		carrito.addElements(producto);
		carrito.addElements(producto1);
		carrito.addElements(productoEspecial);
		
		assertTrue(carrito.getSetElements().contains(producto));
		assertTrue(carrito.getSetElements().contains(producto1));
		assertEquals(25035.5F, carrito.total());
		
	}
	
	
}
