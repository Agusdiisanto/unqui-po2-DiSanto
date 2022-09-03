package equipo.de.trabajo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EquipoDeTrabajoTest {
	
	Persona agustin;
	Persona matias;
	Persona jose; 
	EquipoDeTrabajo discas;
	
	
	@BeforeEach
	public void setUp() {
		
		agustin = new Persona ("Agustin", LocalDate.of(2002,11,3), "Di Santo");
		matias = new Persona ("Matias", LocalDate.of(1995,4,15), "Di Santo");
		jose = new Persona ("Jose", LocalDate.of(1965,8,30), "Di Santo");
		discas = new EquipoDeTrabajo("Discas");
		
		discas.addIntegrante(agustin);
		discas.addIntegrante(matias);
		discas.addIntegrante(jose);
		
	}
	
	
	
	
	
	@Test
	public void calcularPromedioDeEdadEquipoTrabajo() {
		
		int promedioExpectante = discas.promedioDeEdadIntegrantes();
		assertEquals(promedioExpectante,34);

	}
	
	

}
