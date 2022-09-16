package agencia.clase;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AgendaTest {

	Agenda agencia;
	
	@BeforeEach
	public void setUp() {
		
		agencia = new Agenda();
		agencia.agregarNombre("Jose");
		agencia.agregarNombre("Pepe");
		agencia.agregarNombre("Pato");
		agencia.agregarNombre("Julian");
	}
	
	@Test 
	public void unaAgendaTieneUnaCantidadDeNombres() {
		assertEquals(4, agencia.cantidadDeNombres());
	}
	
	@Test
	public void unaAgendaTieneAlMenosUnNombreQueEmpiezaConJ() {
		assertTrue(agencia.tieneAlMenosUnNombreQueEmpiezaCon("J"));
	}
	
	@Test
	public void unaAgendaNoTieneAlMenosUnNombreQueEmpiezaConA() {
		assertFalse(agencia.tieneAlMenosUnNombreQueEmpiezaCon("A"));
	}
	
	@Test
	public void unaAgendaTieneTodosNombresQueEmpiezanConT() {
		assertFalse(agencia.todosEmpiezanCon("T"));
	}
	
	@Test
	public void unaAgendaPuedeFiltrarNombres() {
		assertEquals(2,agencia.cantidadDeNombresFiltradosPorLetra("J"));
	}
	
	
}
