package bancos.y.prestamos;

public class CreditoHipotecario extends SolicitudDeCredito {
	
	
	private Garantia garantia;
	
	public CreditoHipotecario(Cliente cliente, double montoSolicitado, int cuotasAPagar, Garantia garantia) {
		super(cliente, montoSolicitado, cuotasAPagar);
		this.garantia = garantia;
	}

	@Override
	public boolean esSolicitudAceptable() {
		double mitadDeIngresoMensual = this.getCliente().getSueldoNetoMensual() - (this.getCliente().getSueldoNetoMensual() *50 /100);
		double valorFiscalAl70 = garantia.getValorFiscal() - (garantia.getValorFiscal() * 70 /100);
		
		return (mitadDeIngresoMensual > this.getMontoSolicitado()) && 
				(this.getMontoSolicitado() < valorFiscalAl70) && 
				(this.edadCalculadaPorCuotas() < 65)	
		;
	}
	

}
