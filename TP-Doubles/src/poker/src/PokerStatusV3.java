package poker.src;
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
	
	public boolean esManoGanadoraMisCartasDe(List<Carta> listaDeCartas1, List<Carta> listaDeCartas2) {
		
		boolean esGanador = true;
		
		if (this.verificar(listaDeCartas1) == "Poker" && this.verificar(listaDeCartas2) == "Color") {
			esGanador = !esGanador;
		}
		else if (this.verificar(listaDeCartas1) == "Poker" && this.verificar(listaDeCartas2) == "Trio") {
			esGanador = !esGanador;
		}
		
		return esGanador;
		
		
	}
	
	public String verificar(List<Carta> listaDeCartas) {
		
		String resultado = "No se formo nada";
		
		if(this.hayColor(listaDeCartas)) {
			resultado = "Color";
		}
		else if (this.hayTrio(listaDeCartas)) {
			resultado = "Trio";
		}
		else if(this.hayPoker(listaDeCartas)) {
			resultado = "Poker";
		}
		return resultado;
	}
	
	public boolean hayPoker(List<Carta> listaDeCartas) {
		
		return (this.tieneMismoNumero(listaDeCartas) || this.tieneMismoPalo(listaDeCartas));
	}
	
    public boolean tieneMismoNumero(List<Carta> listaDeCartas) {

		List<Carta> cartak =  listaDeCartas.stream().filter(c -> this.esElMismoNumero(listaDeCartas.get(0), c)).collect(Collectors.toList());
		List<Carta> cartax =  listaDeCartas.stream().filter(c -> this.esElMismoNumero(listaDeCartas.get(1), c)).collect(Collectors.toList());

		return (cartak.size() == 4 || cartax.size() == 4);
	}
	
	public boolean tieneMismoPalo(List<Carta> listaDeCartas) {
		
		List<Carta> cartak =  listaDeCartas.stream().filter(c -> this.esElMismoPalo(listaDeCartas.get(0), c)).collect(Collectors.toList());
		List<Carta> cartax =  listaDeCartas.stream().filter(c -> this.esElMismoPalo(listaDeCartas.get(1), c)).collect(Collectors.toList());
	
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
	
    public boolean hayColor(List<Carta> listaDeCartas) {
       
        List<Carta> cartasFiltradas = listaDeCartas.stream().filter(c -> this.esElMismoPalo(listaDeCartas.get(0), c)).collect(Collectors.toList());
        return (cartasFiltradas.size() == 5);
    }
    
    public boolean hayTrio(List<Carta> listaDeCartas) {
   
        List<Carta> cartas1 = listaDeCartas.stream().filter(c -> this.esElMismoNumero(listaDeCartas.get(0), c)).collect(Collectors.toList());
        List<Carta> cartas2 = listaDeCartas.stream().filter(c -> this.esElMismoNumero(listaDeCartas.get(1), c)).collect(Collectors.toList());
        List<Carta> cartas3 = listaDeCartas.stream().filter(c -> this.esElMismoNumero(listaDeCartas.get(2), c)).collect(Collectors.toList());
        
        return (cartas1.size() == 3 || cartas2.size() == 3 || cartas3.size() == 3);
    }
	
	
	
	
	
	
	
	
	
	

}
