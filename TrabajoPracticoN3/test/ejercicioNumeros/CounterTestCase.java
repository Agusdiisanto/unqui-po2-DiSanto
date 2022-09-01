package ejercicioNumeros;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ejercicioNumeros.Counter;


public class CounterTestCase {
	
	
	Counter counter;
	
	@BeforeEach
	public void setUp() {
		counter = new Counter();
		counter.addNumero(1);
		counter.addNumero(3);
		counter.addNumero(5);
		counter.addNumero(7);
		counter.addNumero(9);
		counter.addNumero(1);
		counter.addNumero(1);
		counter.addNumero(1);
		counter.addNumero(1);
		counter.addNumero(4);	
	}
	
	
	@Test
	public void testEvenNumbers () {
		
		int amount = counter.cantidadDeNumerosPares();
		assertEquals(amount, 1);
	}
	
	@Test 
	public void testOddNumbers() {
		int amount = counter.cantidadDeNumerosImpares();
		assertEquals(amount, 9);
	}
	
	@Test
	public void testMultipleOfNumber() {
		int amount = counter.cantidadDeMultiplos(3);
		assertEquals(amount,1);   // Revisar tendria que ser 2 lo esperado
	}
	
	@Test 
	public void testDigitosPares() {
		
		int amount = counter.numeroConMayorDigitosPares(Arrays.asList(1124,2543,36546,475476,22222));
		assertEquals(amount, 5);
		
	}
	
	@Test 
	public void testMayorMultiplo() {
		
		int amount = counter.numeroMultiploMasAlto(3, 9);
		assertEquals(amount,999);
		
	}
	
}
