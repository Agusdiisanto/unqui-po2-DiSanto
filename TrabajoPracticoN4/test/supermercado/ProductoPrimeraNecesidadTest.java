package supermercado;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad arroz;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 7.2, false,4);
		arroz = new ProductoPrimeraNecesidad("Arroz", 5.9, true,10);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(7.2, leche.getPrecio());
	}
	
	@Test
	public void testCalcularDescuentoDeLaLeche() {
		
		double precioConDescuentoEsperado = leche.getPrecio() * (leche.getDescuento() / 100);
		assertEquals(precioConDescuentoEsperado, leche.realizarDescuento());
		
	}
	
	@Test
	public void testCalcularDescuentoDeArroz() {
		double precioConDescuentoEsperado = arroz.getPrecio() * (arroz.getDescuento() / 100);
		assertEquals(precioConDescuentoEsperado, arroz.realizarDescuento());
	}
	
	@Test
	public void testPrecioActualizadoConDescuento() {
		double precioConDescuentoEsperado = arroz.getPrecio() -arroz.getPrecio() * (arroz.getDescuento() / 100);
		assertEquals(precioConDescuentoEsperado, arroz.precioConDescuentoAplicado());
	}
	
	
}
