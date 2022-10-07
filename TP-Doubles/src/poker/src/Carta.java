package poker.src;

public class Carta {
	
	private String numeroDeCarta;
	private Palo paloDeCarta;
	
	public Carta(String numeroDeCarta, Palo paloDeCarta) {
		super();
		this.numeroDeCarta = numeroDeCarta;
		this.paloDeCarta = paloDeCarta;
	}

	public String getNumeroDeCarta() {
		return numeroDeCarta;
	}

	public Palo getPaloDeCarta() {
		return paloDeCarta;
	}	
}
