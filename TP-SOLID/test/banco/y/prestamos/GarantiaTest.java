package banco.y.prestamos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bancos.y.prestamos.Garantia;

public class GarantiaTest {
	
	Garantia garantiaCasa;
	
	@BeforeEach
	public void setUp() {
		
		garantiaCasa = new Garantia("Casa", 70000, "Quilmes");
	}
	
	@Test
	public void test01_unaGarantiaTieneUnaDescripcion() {
		assertEquals("Casa",garantiaCasa.getDescripcion() );
	}
	
	@Test
	public void test02_unaGarantiaTieneUnValorFiscal() {
		assertEquals(70000,garantiaCasa.getValorFiscal() );
	}
	
	@Test
	public void test03_unaGarantiaTieneUnaDireccion() {
		assertEquals("Quilmes",garantiaCasa.getDireccion() );
	}
	
	
}
