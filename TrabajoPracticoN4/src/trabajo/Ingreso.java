package trabajo;

public class Ingreso {
	
	private String mesDePercepcion;
	private String concepto;
	private double montoPercibido;
	
	
	public Ingreso(String mesDePercepcion, String concepto, double montoPercibido) {
		this.mesDePercepcion = mesDePercepcion;
		this.concepto = concepto;
		this.montoPercibido = montoPercibido;
	}
	
	public String getMesDePercepcion() {
		return mesDePercepcion;
	}
	public String getConcepto() {
		return concepto;
	}
	public double getMontoPercibido() {
		return montoPercibido;
	}
	
	
	

	
	
	
	
}
