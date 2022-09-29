package servicios;

public class Impuesto implements Factura {

	private double tasaDeServicio;
	private AgenciaRecaudadora agencia;
	
	public double getTasaDeServicio() {
		return tasaDeServicio;
	}

	public Impuesto(double tasaDeServicio) {
		this.tasaDeServicio = tasaDeServicio;
	}

	@Override
	public double montoAPagar() {
		agencia.registrarPago(this);
		return this.getTasaDeServicio();
	}
	 
	
}
 