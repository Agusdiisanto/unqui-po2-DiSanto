package trabajo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TrabajadorTest {
	
	Trabajador agustin;
	Ingreso reciboNoviembre;
	Ingreso reciboDiciembre;
	IngresoPorHorasExtras reciboEnero;
	
	@BeforeEach
	public void setUp() {
		
		agustin = new Trabajador();
		reciboNoviembre = new Ingreso("Noviembre", "Trabajor", 10000);
		reciboDiciembre = new Ingreso("Diciembre", "Trabajor", 5000);
		reciboEnero = new IngresoPorHorasExtras("Enero", "Trabajor", 2000, 12);
		
		agustin.reciboDeSueldo(reciboNoviembre);
		agustin.reciboDeSueldo(reciboDiciembre);
		agustin.reciboDeSueldo(reciboEnero);
	}
	
	
	
	@Test
	public void unTrabajorSabeSuMontoImponible() {
		assertEquals(2012.0, agustin.getmontoImponible());
	}
	
	@Test
	public void unTrabajorSabeSuImpuestoAPagar() {
		assertEquals(40.24, agustin.getimpuestoAPagar());
	}
	
	@Test
	public void unTrabajorSabeSuTotalPercibido() {
		assertEquals(17012.0, agustin.getTotalPercibido());
	}
	
}
