package warcraft.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import warcraft.src.Caballero;
import warcraft.src.Ejercito;
import warcraft.src.Ingeniero;

public class PersonajeTest {
	
	Ingeniero ingenierio;
	Ingeniero ingenierio1;
	Ingeniero ingenierio2;
	
	Caballero caballero;
	Caballero caballero1;
	Caballero caballero2;
	
	Ejercito ejercito;
	Ejercito ejercito1;
	
	@BeforeEach
	public void setUp() {
		
		ingenierio = new Ingeniero();
		ingenierio1 = new Ingeniero();
		ingenierio2 = new Ingeniero();
		
		caballero = new Caballero();
		caballero1 = new Caballero();
		caballero2 = new Caballero();
		
		ejercito = new Ejercito();
		
	}
	

	@Test
	public void test01_unEjercitoEstaCompuestoPorUnCaballeroYingeniero() {
		
		ejercito.AgregarPersonajes(caballero);
		ejercito.AgregarPersonajes(ingenierio);
		
		assertTrue(ejercito.getPersonajes().contains(caballero));
		assertTrue(ejercito.getPersonajes().contains(ingenierio));
	}
	
	@Test
	public void test02_unEjercitoEstaCompuestoPorUnCaballeroYingenieroYOtroEjercito() {
		
		ejercito.AgregarPersonajes(caballero);
		ejercito.AgregarPersonajes(ingenierio);
		ejercito.AgregarPersonajes(ejercito1);
		
		assertTrue(ejercito.getPersonajes().contains(caballero));
		assertTrue(ejercito.getPersonajes().contains(ingenierio));
		assertTrue(ejercito.getPersonajes().contains(ejercito1));
	}
	
}
