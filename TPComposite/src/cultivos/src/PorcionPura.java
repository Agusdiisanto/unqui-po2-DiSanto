package cultivos.src;

public class PorcionPura implements PorcionDeTierra{
	
	private Cultivo cultivoDeParcela;
	
	public PorcionPura(Cultivo cultivo) {
		this.cultivoDeParcela = cultivo;
	}
	
	public Cultivo getCultivo() {
		return cultivoDeParcela;
	}

	@Override
	public double gananciasAnuales() {
		// TODO Auto-generated method stub
		return cultivoDeParcela.precioBaseAnual();
	}

	
	
	
}
