package ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ColorTest {
	
	
	@Test
	public void cuandoUnColorSabeSuNivelDeRiesgo() {
		assertEquals(1, Color.ROJO.nivelDeRiesgo);
	}
	
	@Test
	public void cuandoUnColorSabeSuProximoColor() {
		assertEquals("GRIS",Color.ROJO.proximoColor);
	}
	
}
