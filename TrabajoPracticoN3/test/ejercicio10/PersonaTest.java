package ejercicio10;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PersonaTest {
	
	Persona persona1;
	Persona persona2;
	
	@BeforeEach
	public void setUp() {
		
		persona1 = new Persona("Agustin", LocalDate.of(2002,11,3));
		persona2 = new Persona("Agustin", LocalDate.of(1965,8,30));
	}
	
	
	
	@Test 
	public void unaPersonaTieneUnaEdad() {
		
		System.out.println(persona1.edad());
		
		assertEquals(persona1.edad(), 19);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
