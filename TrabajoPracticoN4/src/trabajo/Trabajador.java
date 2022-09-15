package trabajo;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
	private List<Ingreso> ingresos = new ArrayList<Ingreso>();

	
	public double getTotalPercibido() {
		
		double totalPercibido = 0;
		
		for (Ingreso ingreso : ingresos) {
			totalPercibido += ingreso.getMontoPercibido();
		}
		return totalPercibido;
	}
	
	public void reciboDeSueldo(Ingreso ingresoDeSueldo) {
		this.ingresos.add(ingresoDeSueldo);
	}
	
	public double getimpuestoAPagar() {
		return (this.getmontoImponible() *2 /100);
	}
	
	public double getmontoImponible() {
		
		int lastIdx = ingresos.size() - 1;
		Ingreso ultimoElemento = ingresos.get(lastIdx);
		
		return ultimoElemento.getMontoPercibido();
		
	}
	
	
	
}
