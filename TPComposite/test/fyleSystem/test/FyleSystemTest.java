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
	Directorio directorio2;
	
	@BeforeEach
	
	public void setUp() {
		
		archivo1 = new Archivo(20,"Apple",LocalDate.of(2002, 3, 1));
		archivo2 = new Archivo(30,"AppData",LocalDate.of(2000, 4, 12));
		archivo3 = new Archivo(40,"Linux",LocalDate.of(1999, 12, 4));
		directorio1 = new Directorio("Users", LocalDate.of(1954, 12, 1));
		directorio2 = new Directorio("Windows", LocalDate.of(2021, 9, 30));
	}
	
	
	@Test
	public void test01_UnDirectorioTieneUnArchivo() {
		directorio1.agregarContenido(archivo1);
		assertTrue(directorio1.getContenido().contains(archivo1));
	}
	
	@Test
	public void test02_UnDirectorioCalculaElTamañoTotalDeUnSoloArchivo() {
		directorio1.agregarContenido(archivo1);
		assertEquals(20, directorio1.totalSize());
	}
	
	@Test
	public void test03_UnDirectorioCalculaElTamañoTotalDeDosArchivos() {
		directorio1.agregarContenido(archivo1);
		directorio1.agregarContenido(archivo2);
		assertEquals(50, directorio1.totalSize());
	}
	
	@Test
	public void test04_UnDirectorioCalculaElTamañoTotalDeDosArchivosYOtroDirectorio() {
		
		directorio2.agregarContenido(archivo3);
		
		directorio1.agregarContenido(archivo1);
		directorio1.agregarContenido(archivo2);
		directorio1.agregarContenido(directorio2);
		
		assertEquals(90, directorio1.totalSize());
	}
	
	
}
