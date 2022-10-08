package fyleSystem.test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fyleSystem.src.Archivo;
import fyleSystem.src.Directorio;

public class FyleSystemTest {
	
	Archivo archivo1;
	Archivo archivo2;
	Archivo archivo3;
	Directorio directorio1;
	
	@BeforeEach
	
	public void setUp() {
		
		archivo1 = new Archivo(20,"Pepe",LocalDate.of(2002, 3, 1));
		archivo2 = new Archivo(20,"Pepe",LocalDate.of(2000, 4, 12));
		archivo3 = new Archivo(20,"Pepe",LocalDate.of(1999, 12, 4));
		directorio1 = new Directorio("Agustin", LocalDate.of(2002, 3, 1));
	}
	
	
	@Test
	public void test01_UnDirectorioTieneUnArchivo() {
		directorio1.agregarContenido(archivo1);
		assertTrue(directorio1.getContenido().contains(archivo1));
	}
	
	@Test
	public void test02_UnDirectorioCalculaElTamañoTotal() {
		directorio1.agregarContenido(archivo1);
		assertEquals(20, directorio1.totalSize());
	}
	
	
}
