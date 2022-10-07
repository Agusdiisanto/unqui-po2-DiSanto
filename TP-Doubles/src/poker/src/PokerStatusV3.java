package poker.src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * Cree otra version de pokerStatus porque queria ver el progreso
 * De como se va modificando los metodos o los mensajes 
 * y que formas hay de mejorar un codigo
 * 
 */ 

public class PokerStatusV3 {
	
	// AHORA QUIERO DECIR QUE SE FORMA, SI POKER, COLOR O TRIO
	
	public boolean esManoGanador() {
			
		return true;
	}
	
	public String verificar(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		String resultado = "No se formo nada";
		
		if(this.hayColor(carta1, carta2, carta3, carta4, carta5)) {
			resultado = "Color";
		}
		else if (this.hayTrio(carta1, carta2, carta3, carta4, carta5)) {
			resultado = "Trio";
		}
		else if(this.hayPoker(carta1, carta2, carta3, carta4, carta5)) {
			resultado = "Poker";
		}
		return resultado;
	}
	
	public boolean hayPoker(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		return (this.tieneMismoNumero(carta1, carta2, carta3, carta4, carta5) || this.tieneMismoPalo(carta1, carta2, carta3, carta4, carta5));
	}
	
    public boolean tieneMismoNumero(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {

		List<Carta> listaDeCartas =  Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		List<Carta> cartak =  listaDeCartas.stream().filter(c -> this.esElMismoNumero(carta1, c)).collect(Collectors.toList());
		List<Carta> cartax =  listaDeCartas.stream().filter(c -> this.esElMismoNumero(carta2, c)).collect(Collectors.toList());

		return (cartak.size() == 4 || cartax.size() == 4);
	}
	
	public boolean tieneMismoPalo(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
		
		List<Carta> listaDeCartas =  Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		List<Carta> cartak =  listaDeCartas.stream().filter(c -> this.esElMismoPalo(carta1, c)).collect(Collectors.toList());
		List<Carta> cartax =  listaDeCartas.stream().filter(c -> this.esElMismoPalo(carta2, c)).collect(Collectors.toList());
	
		return (cartak.size() == 4 || cartax.size() == 4);
	}
 
	public boolean esElMismoPalo(Carta carta1, Carta carta2) {
		return (this.getPaloDeCarta(carta2) == this.getPaloDeCarta(carta1)); 		
	}
	
	public boolean esElMismoNumero(Carta carta1, Carta carta2) {
		return (this.getValorDeCarta(carta2) == this.getValorDeCarta(carta1)); 		
	}
		 
	public String getValorDeCarta(Carta carta) {
		return carta.getNumeroDeCarta();
	}
	
	public Palo getPaloDeCarta(Carta carta) {
		return carta.getPaloDeCarta();
	}
	
	// =============================================
    // ================== PARTE 2 ==================
    // =============================================
	
    public boolean hayColor(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
        List<Carta> listaDeCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
        List<Carta> cartasFiltradas = listaDeCartas.stream().filter(c -> this.esElMismoPalo(carta1, c)).collect(Collectors.toList());
        return (cartasFiltradas.size() == 5);
    }
    
    public boolean hayTrio(Carta carta1, Carta carta2, Carta carta3, Carta carta4, Carta carta5) {
   
        List<Carta> listaDeCartas =  Arrays.asList(carta1,carta2,carta3,carta4,carta5);
        List<Carta> cartas1 = listaDeCartas.stream().filter(c -> this.esElMismoNumero(carta1, c)).collect(Collectors.toList());
        List<Carta> cartas2 = listaDeCartas.stream().filter(c -> this.esElMismoNumero(carta2, c)).collect(Collectors.toList());
        List<Carta> cartas3 = listaDeCartas.stream().filter(c -> this.esElMismoNumero(carta3, c)).collect(Collectors.toList());
        
        return (cartas1.size() == 3 || cartas2.size() == 3 || cartas3.size() == 3);
    }
	
	
	
	
	
	
	
	
	
	

}
