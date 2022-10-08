package fyleSystem.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fyleSystem.src.Archivo;

public class ArchivoTest {
	
	Archivo archivo;
	
	@BeforeEach
	public void setUp() {
		archivo = new Archivo(20,"Apple",LocalDate.of(2002, 3, 1));	
	}
	
	@Test
	public void test01_unArchivoSabeSuTamaño() {
		assertEquals(20, archivo.getSize());
	}
	
	@Test
	public void test02_unArchivoSabeSuTamaño() {
		assertEquals(20, archivo.getSize());
	}
	
	@Test
	public void test02_unArchivoSabeSuNombre() {
		assertEquals("Apple", archivo.getNombre());
	}
	
}
