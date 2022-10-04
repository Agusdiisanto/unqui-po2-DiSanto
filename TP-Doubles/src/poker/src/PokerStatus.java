package poker.src;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PokerStatus {
	
	private String carta1;
	private String carta2;
	private String carta3;
	private String carta4;
	private String carta5;
	
	public PokerStatus(String carta1, String carta2, String carta3, String carta4, String carta5) {
		this.carta1 = carta1;
		this.carta2 = carta2;
		this.carta3 = carta3;
		this.carta4 = carta4;
		this.carta5 = carta5;
	}

	public String getCarta1() {
		return carta1;
	}
	
	public String getCarta2() {
		return carta2;
	}

	public String getCarta3() {
		return carta3;
	} 

	public String getCarta4() {
		return carta4;
	}

	public String getCarta5() {
		return carta5;
	}
	
	// PARA QUE SEA POKER NECESITO 4 DEL MISMO NUMERO O DEL MISMO PALO || SOLO POR EL MOMENTO DE 
	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		
		List<String> listaDeCartas =  Arrays.asList(carta1,carta2,carta3,carta4,carta5);
		List<String> cartak =  listaDeCartas.stream().filter(c -> this.esElMismoNumero(carta1, c)).collect(Collectors.toList());
		List<String> cartax =  listaDeCartas.stream().filter(c -> this.esElMismoNumero(carta2, c)).collect(Collectors.toList());
		List<String> cartay =  listaDeCartas.stream().filter(c -> this.esElMismoNumero(carta3, c)).collect(Collectors.toList());
		
		return (cartak.size() >= 4) || (cartax.size() >= 4) || (cartay.size() >= 4);
	}
	

	public boolean esElMismoNumero(String carta1, String carta2) {
		Character caracteresCarta1 = carta1.charAt(0);
		Character caracteresCarta2 = carta1.charAt(0);
		return (caracteresCarta1 == caracteresCarta2) && (carta1.length() == carta2.length()); 		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
