package poker.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import poker.src.PokerStatus;
import poker.src.PokerStatusV2;

public class PokerStatusTest {
	
	// Exercise 
	String carta1D  = "1D";
    String carta3D  = "3D";
    String carta5D  = "5D";
    String carta8D  = "8D";
    String carta10D = "10D";
    
    String carta5P  = "5P";
    String carta7P  = "7P";
    
    String carta5C  = "5C";
    String carta3C  = "3C";
    
    String carta5T  = "5T";
    String carta9T  = "9T";
	
	
	
	PokerStatus juegoDeMesa;
	PokerStatusV2 juegoDeMesa2;
	
	@BeforeEach
	public void setUp() {
		
		juegoDeMesa = new PokerStatus();
		juegoDeMesa2 = new PokerStatusV2();
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
	
    @Test
    public void test08_HayColor() {
        assertTrue(juegoDeMesa.hayColor(carta1D,carta3D,carta5D,carta8D,carta10D));
    }
    
    @Test
    public void test09_NoHayColor() {
        assertFalse(juegoDeMesa.hayColor(carta5P,carta1D,carta5T,carta5C,carta5D));
    }
    
    @Test
    public void test10_HayTrio() {
        assertTrue(juegoDeMesa.hayTrio(carta5P,carta1D,carta5T,carta5C,carta3D));
    }
    
    @Test
    public void test11_NoHayTrio() {
        assertFalse(juegoDeMesa.hayTrio(carta5P,carta1D,carta10D,carta5C,carta3D));
    }
	
    @Test
    public void test12_cuandoHayMismoPaloOMismoNumeroDevuelvePoker() {
        assertEquals("Poker", juegoDeMesa2.verificar(carta10D, carta1D, carta3D, carta8D, carta5C));
    }
	
    @Test
    public void test13_cuandoHayColorDevuelveColor() {
        assertEquals("Color", juegoDeMesa2.verificar(carta10D, carta1D, carta3D, carta8D, carta5D));
    }
	
}
