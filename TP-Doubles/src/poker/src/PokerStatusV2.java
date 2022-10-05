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

public class PokerStatusV2 {
	
	// AHORA QUIERO DECIR QUE SE FORMA, SI POKER, COLOR O TRIO
	public String verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		String resultado = "No se formo nada";
		
		if(this.hayPoker(carta1, carta2, carta3, carta4, carta5)) {
			resultado = "Poker";
		}
		else if (this.hayColor(carta1, carta2, carta3, carta4, carta5)) {
			resultado = "Color";
		}
		else if(this.hayTrio(carta1, carta2, carta3, carta4, carta5)) {
			resultado = "Trio";
		}
		return resultado;
	}
	
	public boolean hayPoker(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		return (this.tieneMismoNumero(carta1, carta2, carta3, carta4, carta5) || this.tieneMismoPalo(carta1, carta2, carta3, carta4, carta5));
	}
	
    public boolean tieneMismoNumero(String carta1, String carta2, String carta3, String carta4, String carta5) {

		List<String> listaDeCartas =  Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		List<String> cartak =  listaDeCartas.stream().filter(c -> this.esElMismoNumero(carta1, c)).collect(Collectors.toList());
		List<String> cartax =  listaDeCartas.stream().filter(c -> this.esElMismoNumero(carta2, c)).collect(Collectors.toList());

		return (cartak.size() == 4 || cartax.size() == 4);
	}
	
	public boolean tieneMismoPalo(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		List<String> listaDeCartas =  Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		List<String> cartak =  listaDeCartas.stream().filter(c -> this.esElMismoPalo(carta1, c)).collect(Collectors.toList());
		List<String> cartax =  listaDeCartas.stream().filter(c -> this.esElMismoPalo(carta2, c)).collect(Collectors.toList());
	
		return (cartak.size() >= 4 || cartax.size() >= 4);
	}

	public boolean esElMismoPalo(String carta1, String carta2) {
		return (this.getPaloDeCarta(carta2) == this.getPaloDeCarta(carta1)); 		
	}
	
	public boolean esElMismoNumero(String carta1, String carta2) {
		return (this.getValorDeCarta(carta2) == this.getValorDeCarta(carta1)); 		
	}
		 
	public int getValorDeCarta(String carta) {

		int valorDeLaCarta; 
		
		if(carta.length() == 3) {
			valorDeLaCarta = 10;
		}
		else {
			valorDeLaCarta = (int)carta.charAt(0);
		}
		return valorDeLaCarta;
	}
	
	public Character getPaloDeCarta(String carta) {
		return carta.charAt(carta.length()-1);
	}
	
	// =============================================
    // ================== PARTE 2 ==================
    // =============================================
	
    public boolean hayColor(String carta1, String carta2, String carta3, String carta4, String carta5) {
        List<String> listaDeCartas = Arrays.asList(carta1,carta2,carta3,carta4,carta5);
        List<String> cartasFiltradas = listaDeCartas.stream().filter(c -> this.esElMismoPalo(carta1, c)).collect(Collectors.toList());
        return (cartasFiltradas.size() == 5);
    }
    
    public boolean hayTrio(String carta1, String carta2, String carta3, String carta4, String carta5) {
        List<String> listaDeCartas =  Arrays.asList(carta1,carta2,carta3,carta4,carta5);
        List<String> cartas1 = listaDeCartas.stream().filter(c -> this.esElMismoNumero(carta1, c)).collect(Collectors.toList());
        List<String> cartas2 = listaDeCartas.stream().filter(c -> this.esElMismoNumero(carta2, c)).collect(Collectors.toList());
        List<String> cartas3 = listaDeCartas.stream().filter(c -> this.esElMismoNumero(carta3, c)).collect(Collectors.toList());
        return (cartas1.size() >= 3 || cartas2.size() >= 3 || cartas3.size() >= 3);
    }
	
	
	
	
	
	
	
	
	
	

}
