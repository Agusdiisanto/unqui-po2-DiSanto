package trabajo;

import java.util.ArrayList;

public class Trabajador {
	
	private ArrayList<Ingreso> ingresos;
	
	public Trabajador( ArrayList<Ingreso> ingresos) {
		this.ingresos = ingresos;
	}
	
	public double getTotalPercibido() {
		
		double totalPercibido = 0;
		
		for (Ingreso ingreso : ingresos) {
			totalPercibido += ingreso.getMontoPercibido();
		}
		return totalPercibido;
	}
	
	public void reciboDeSueldo(Ingreso ingreso) {
		this.ingresos.add(ingreso);
	}
	
	public double getimpuestoAPagar() {
		return (this.getmontoImponible() /2 *100);
	}
	
	public double getmontoImponible() {
		
		int lastIdx = ingresos.size() - 1;
		Ingreso ultimoElemento = ingresos.get(lastIdx);
		
		return ultimoElemento.getMontoPercibido();
		
	}
	
	
	
}
