package ejercicio.numeros;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class MultioperadorTest {
	
	Multioperador multioperador; 
	
	
	@BeforeEach
	public void setUp() {
		
		this.multioperador = new Multioperador();
		multioperador.addNumero(1);
		multioperador.addNumero(1);
	}
	
	@Test
	public void cuandoElMultioperadorSuma() {

		int cuentaEsperada = multioperador.sumarNumeros();
		assertEquals(cuentaEsperada, 2);
	}
	
	@Test
	public void cuandoElMultioperadorMultiplica() {

		int cuentaEsperada = multioperador.multiplicarNumeros();
		assertEquals(cuentaEsperada, 1);
	}
	
	@Test
	public void cuandoElMultioperadorResta() {

		int cuentaEsperada = multioperador.restarNumeros();
		assertEquals(cuentaEsperada, -1);
	}
	
	
	
	
}
 