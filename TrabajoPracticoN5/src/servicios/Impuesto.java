package servicios;

public class Impuesto implements Factura {

	private double tasaDeServicio;
	
	public double getTasaDeServicio() {
		return tasaDeServicio;
	}

	public Impuesto(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}

	@Override
	public double montoAPagar() {
		return this.getTasaDeServicio();
	}
	 
	
}
 