package simetria.de.formas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PuntoTest {
	
	Punto punto;
	Punto punto1;
	
	@BeforeEach
	public void setUp() {
		punto = new Punto();
		punto1 = new Punto(1,3);
	}
		
	@Test
	public void unPuntoSeInicializaConCoordenadasVacias(){
		
		assertEquals(punto.getY(),0);
		assertEquals(punto.getX(),0);
		
	}
	
	
	@Test
	public void unPuntoSePuedeInicializarConCoordenadas() {
		
		assertEquals(punto1.getY(),3);
		assertEquals(punto1.getX(),1);
		
	}
	
	@Test 
	public void unPuntoSePuedeMoverAOtraCoordenada() {
		
		punto.moverPuntoAPosicion(2, 6);
		
		assertEquals(punto.getY(),6);
		assertEquals(punto.getX(),2);
	}
	
	@Test
	public void unPuntoSePuedeSumarSusCoordenadasConOtroPunto() {
		
		punto.setX(3);
		punto.setY(4);
		
		punto.sumarUnPunto(punto1);
		assertEquals(punto.getY(),7);
		assertEquals(punto.getX(),4);
		
		
	}
	
	

}
