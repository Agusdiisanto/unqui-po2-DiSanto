package poker.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import poker.src.PokerStatus;

public class PokerStatusTest {
	
	// Exercise 
	String carta5P = "5P";
	String carta10D = "10D";
	String carta5C = "5C";
	String carta5D = "5D";
	String carta5T = "5T";
	String carta3D = "3D";
	String carta1D = "1D";
	
	
	
	PokerStatus juegoDeMesa;
	
	@BeforeEach
	public void setUp() {
		
		juegoDeMesa = new PokerStatus();
		
	}
	
	@Test 
    public void test01_hayDosCartasDeMismoNumero() {
		assertTrue(juegoDeMesa.esElMismoNumero(carta5P,carta5T));
	}
	
	@Test 
    public void test02_hayCuatroCartasDeMismoNumero() {
		assertTrue(juegoDeMesa.tieneMismoNumero(carta10D,carta5T,carta5P,carta5C,carta5D));
	}
	
	@Test 
    public void test03_hayDosCartasDeMismoPalo() {
		assertTrue(juegoDeMesa.esElMismoPalo(carta10D,carta5D));
	}	
	
	@Test 
    public void test04_NoHayCuatroCartasDeMismoPalo() {
		assertFalse(juegoDeMesa.tieneMismoPalo(carta10D,carta5T,carta5P,carta5C,carta5D)); // Verify
	}
	
	@Test 
    public void test05_HayCuatroCartasDeMismoPalo() {
		assertTrue(juegoDeMesa.tieneMismoPalo(carta10D,carta1D,carta3D,carta5C,carta5D));
	}
	
	@Test 
    public void test06_cuandoHayPokerPorNumero() {
		assertTrue(juegoDeMesa.verificar(carta10D,carta5P,carta5C,carta5T,carta5D));
	}
	
	@Test 
    public void test07_cuandoHayPokerPorPalo() {
		assertTrue(juegoDeMesa.verificar(carta10D,carta1D,carta3D,carta5T,carta5D));
	}
	
	
	
	
	
}
