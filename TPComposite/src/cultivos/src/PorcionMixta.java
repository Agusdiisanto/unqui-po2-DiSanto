package cultivos.src;

import java.util.ArrayList;
import java.util.List;

public class PorcionMixta implements PorcionDeTierra{
	
	private List<PorcionDeTierra> parcelas = new ArrayList<PorcionDeTierra>();

	@Override
	public double gananciasAnuales() {
		// TODO Auto-generated method stub
		return parcelas.stream().mapToDouble(p -> p.gananciasAnuales()).sum() / 4;
	}
	
	public void agregarNuevaParcela(PorcionDeTierra porcionDeTierra) {
	
		parcelas.add(porcionDeTierra);
	}
	
	public void eliminarParcela(PorcionDeTierra porcionDeTierra) {
		parcelas.remove(porcionDeTierra);
	}

	public List<PorcionDeTierra> getParcelas() {
		return parcelas;
	}
	
}
