package trabajo;

public class IngresoPorHorasExtras extends Ingreso{
	
	private int cantidadDeHorasExtras;

	
	public IngresoPorHorasExtras(String mesDePercepcion, String concepto, double montoPercibido,int cantidadDeHorasExtras) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.cantidadDeHorasExtras = cantidadDeHorasExtras;
	}
	
	public int getCantidadDeHorasExtras() {
		return cantidadDeHorasExtras;
	}

	@Override
	public double getMontoPercibido() {
		return super.getMontoPercibido() + this.getCantidadDeHorasExtras();
	} 
}
