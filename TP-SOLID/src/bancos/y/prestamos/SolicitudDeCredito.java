package bancos.y.prestamos;

public abstract class SolicitudDeCredito {
	
	Cliente cliente;
	float montoSolicitado;
	int cuotasAPagar;
	
    public abstract boolean esSolicitudAceptable();

	public Cliente getCliente() {
		return cliente;
	}

	public float getMontoSolicitado() {
		return montoSolicitado;
	}

	public int getCuotasAPagar() {
		return cuotasAPagar;
	}
	
	public float montoAPagarPorMonto() {
		return this.getMontoSolicitado() / this.getCuotasAPagar();
	}

	public int edadCalculadaPorCuotas() {
		// 12 coutas = 1 año 
		return (cliente.edad + (this.getCuotasAPagar()/12));
	}
		
}
