package pago.de.facturas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import servicios.Factura;
import servicios.Impuesto;
import servicios.Servicio;

public class FacturaTest {
	
	Factura servicioAPagar;
	Factura impuestoAPagar;
	
	
	@BeforeEach
	public void setUp() {
		servicioAPagar = new Servicio(100, 200);
		impuestoAPagar = new Impuesto(100);
	}	
	
	@Test
	public void monotoAPagarDelServicio() {
		assertEquals(20000, servicioAPagar.montoAPagar());
	}
	
	@Test
	public void monotoAPagarDelImpuesto() {
		assertEquals(100, impuestoAPagar.montoAPagar());
	}

	
	
}
