package poker.test;

public class PokerStatusTest {
	
	private String carta1;
	private String carta2;
	private String carta3;
	private String carta4;
	private String carta5;
	
		
	public PokerStatusTest(String carta1, String carta2, String carta3, String carta4, String carta5) {
		super();
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
	
	// PARA QUE SEA POKER NECESITO 4 DEL MISMO NUMERO O DEL MISMO PALO
	public boolean verificar(String carta1, String carta2, String carta3, String carta4, String carta5) {
		return ()
	}
	
	public boolean hay4CartasDelMismoNumero(String carta1, String carta2, String carta3, String carta4, String carta5) {
		return (carta1.charAt(1) == carta2.charAt(1) == carta1.charAt(1) == carta3.charAt(1));
	}
	
	
}
