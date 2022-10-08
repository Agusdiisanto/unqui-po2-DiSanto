package cultivos.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import cultivos.src.Cultivo;
import cultivos.src.PorcionMixta;
import cultivos.src.PorcionPura;
import cultivos.src.Soja;
import cultivos.src.Trigo;

public class PorcionDeTierraTest {
	
	PorcionMixta parcelaMixta;
	PorcionMixta parcelaMixta2;
	PorcionPura parcelaPuraConSoja;
	PorcionPura parcelaPuraTrigo;
	Cultivo trigo;
	Cultivo soja;
	
	@BeforeEach
	public void setUp() {
	
		trigo = new Trigo();
		soja = new Soja();
		parcelaPuraConSoja = new PorcionPura(soja);
		parcelaPuraTrigo = new PorcionPura(trigo);
		parcelaMixta = new PorcionMixta();
		parcelaMixta2 = new PorcionMixta();
	}
	
	@Test
	public void test01_LaGananciaAnualDeUnaPorcionPuraEs500EnSoja() {
		assertEquals(2000, parcelaPuraConSoja.gananciasAnuales());
	}
	
	@Test
	public void test02_LaGananciaAnualDeUnaPorcionPuraEs300EnTrigo() {
		assertEquals(1200, parcelaPuraTrigo.gananciasAnuales());
	}
	
	@Test 
	public void test03_LaGananciaAnualDeUnaPorcionMixtaDeSojaSon2000() {
		
		parcelaMixta.agregarNuevaParcela(parcelaPuraConSoja);
		parcelaMixta.agregarNuevaParcela(parcelaPuraConSoja);
		parcelaMixta.agregarNuevaParcela(parcelaPuraConSoja);
		parcelaMixta.agregarNuevaParcela(parcelaPuraConSoja);
		
		assertEquals(2000, parcelaMixta.gananciasAnuales());
	}
	
	@Test 
	public void test04_LaGananciaAnualDeUnaPorcionMixtaDeTrigoEs1200() {
		
		parcelaMixta.agregarNuevaParcela(parcelaPuraTrigo);
		parcelaMixta.agregarNuevaParcela(parcelaPuraTrigo);
		parcelaMixta.agregarNuevaParcela(parcelaPuraTrigo);
		parcelaMixta.agregarNuevaParcela(parcelaPuraTrigo);
		
		assertEquals(1200, parcelaMixta.gananciasAnuales());
	}
	
	@Test
	public void test05_LaGananciaAnualDeUnaPorcionMixtaDeTrigoYSojaEs1600() {
		
		parcelaMixta.agregarNuevaParcela(parcelaPuraTrigo);
		parcelaMixta.agregarNuevaParcela(parcelaPuraConSoja);
		parcelaMixta.agregarNuevaParcela(parcelaPuraConSoja);
		parcelaMixta.agregarNuevaParcela(parcelaPuraTrigo);
		
		assertEquals(1600, parcelaMixta.gananciasAnuales());
	}
	
	@Test
	public void test06_LaGananciaAnualDeUnaPorcionMixtaDeTrigoSojaYUnaMixtaEs1500() {
		
		parcelaMixta2.agregarNuevaParcela(parcelaPuraTrigo);
		parcelaMixta2.agregarNuevaParcela(parcelaPuraConSoja);
		parcelaMixta2.agregarNuevaParcela(parcelaPuraConSoja);
		parcelaMixta2.agregarNuevaParcela(parcelaPuraTrigo);
		
		
		parcelaMixta.agregarNuevaParcela(parcelaPuraTrigo);
		parcelaMixta.agregarNuevaParcela(parcelaMixta2);
		parcelaMixta.agregarNuevaParcela(parcelaPuraConSoja);
		parcelaMixta.agregarNuevaParcela(parcelaPuraTrigo);
		
		assertEquals(1500, parcelaMixta.gananciasAnuales());
	}
	
	
}
