package poker.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import poker.src.Carta;
import poker.src.Palo;
import poker.src.PokerStatusV3;

public class PokerStatusV3Mockito {
	
	Carta carta1D; 
	Carta carta3D;
	Carta carta5D; 
	Carta carta8D; 
	Carta carta10D;
    
	Carta carta5P;  
	Carta carta7P;  
    
	Carta carta3C;  
	Carta carta5C;
	
	Carta carta5T;  
	Carta carta9T; 
	
	PokerStatusV3 juegoDeMesa;
	
	@BeforeEach
	public void setUp() {
		
		// Cartas De Diamantes
		
		carta1D = mock(Carta.class);
		carta3D = mock(Carta.class);
		carta5D = mock(Carta.class);
		carta8D = mock(Carta.class);
		carta10D = mock(Carta.class);
		
		// Cartas De Trebol
	
		carta5T = mock(Carta.class);
		carta9T = mock(Carta.class);
		
		// Cartas De Picas
		
		carta5P = mock(Carta.class);
		carta7P = mock(Carta.class);
		
	    juegoDeMesa = new PokerStatusV3();
		
	}
	  
	
	@Test
	public void tes01_VerificaQueHayColor() {
		
		when(carta1D.getNumeroDeCarta()).thenReturn("1");
		when(carta1D.getPaloDeCarta()).thenReturn(Palo.DIAMANTE);
		
		when(carta3D.getNumeroDeCarta()).thenReturn("3");
		when(carta3D.getPaloDeCarta()).thenReturn(Palo.DIAMANTE);
		
		when(carta5D.getNumeroDeCarta()).thenReturn("5");
		when(carta5D.getPaloDeCarta()).thenReturn(Palo.DIAMANTE);
		
		when(carta8D.getNumeroDeCarta()).thenReturn("8");
		when(carta8D.getPaloDeCarta()).thenReturn(Palo.DIAMANTE);
		
		when(carta10D.getNumeroDeCarta()).thenReturn("10");
		when(carta10D.getPaloDeCarta()).thenReturn(Palo.DIAMANTE);
		
		assertEquals("Color", juegoDeMesa.verificar(carta10D, carta1D, carta3D, carta8D, carta5D));
	
	}
	
	@Test
	public void tes02_VerificaQueHayTrio() {
		
		when(carta5T.getNumeroDeCarta()).thenReturn("5");
		when(carta5T.getPaloDeCarta()).thenReturn(Palo.TREBOLES);
		
		when(carta5P.getNumeroDeCarta()).thenReturn("5");
		when(carta5P.getPaloDeCarta()).thenReturn(Palo.PICAS);
		
		when(carta5D.getNumeroDeCarta()).thenReturn("5");
		when(carta5D.getPaloDeCarta()).thenReturn(Palo.DIAMANTE);
		
		when(carta8D.getNumeroDeCarta()).thenReturn("8");
		when(carta8D.getPaloDeCarta()).thenReturn(Palo.DIAMANTE);
		
		when(carta10D.getNumeroDeCarta()).thenReturn("10");
		when(carta10D.getPaloDeCarta()).thenReturn(Palo.DIAMANTE);
		
		assertEquals("Trio", juegoDeMesa.verificar(carta5T, carta5P, carta8D, carta10D, carta5D));
	
	}
		
	@Test
	public void tes03_VerificaQueHayPoker() {
		
		when(carta5T.getNumeroDeCarta()).thenReturn("5");
		when(carta5T.getPaloDeCarta()).thenReturn(Palo.TREBOLES);
		
		when(carta3D.getNumeroDeCarta()).thenReturn("3");
		when(carta3D.getPaloDeCarta()).thenReturn(Palo.DIAMANTE);
		
		when(carta5D.getNumeroDeCarta()).thenReturn("5");
		when(carta5D.getPaloDeCarta()).thenReturn(Palo.DIAMANTE);
		
		when(carta8D.getNumeroDeCarta()).thenReturn("8");
		when(carta8D.getPaloDeCarta()).thenReturn(Palo.DIAMANTE);
		
		when(carta10D.getNumeroDeCarta()).thenReturn("10");
		when(carta10D.getPaloDeCarta()).thenReturn(Palo.DIAMANTE);
		
		assertEquals("Poker", juegoDeMesa.verificar(carta3D, carta5D, carta8D, carta10D, carta5T));
	
	}
	

	
	
	
	
	
	
	
}
