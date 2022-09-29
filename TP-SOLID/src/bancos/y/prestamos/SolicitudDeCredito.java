package bancos.y.prestamos;

public abstract class SolicitudDeCredito {
	
	private Cliente cliente;
	private double montoSolicitado;
	private int cuotasAPagar;
	
    public SolicitudDeCredito(Cliente cliente, double montoSolicitado, int cuotasAPagar) {
		this.cliente = cliente;
		this.montoSolicitado = montoSolicitado;
		this.cuotasAPagar = cuotasAPagar;
	}

	public abstract boolean esSolicitudAceptable();

	public Cliente getCliente() {
		return cliente;
	}

	public double getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getCuotasAPagar() {
		return cuotasAPagar;
	}
	
	public double montoAPagarPorMonto() {
		return this.getMontoSolicitado() / this.getCuotasAPagar();
	}

	public int edadCalculadaPorCuotas() {
		// 12 coutas = 1 año 
		return (cliente.edad + (this.getCuotasAPagar()/12));
	}
		
}
