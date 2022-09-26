package bancos.y.prestamos;

public class CreditoHipotecario extends SolicitudDeCredito {
	
	Garantia garantia;
	
	@Override
	public boolean esSolicitudAceptable() {
		float mitadDeIngresoMensual = cliente.getSueldoNetoMensual() - cliente.getSueldoNetoMensual() *50 /100;
		float valorFiscalAl70 = garantia.getValorFiscal() - garantia.getValorFiscal() * 70 /100;
		
		return (mitadDeIngresoMensual > this.getMontoSolicitado()) && 
				(this.getMontoSolicitado() > valorFiscalAl70) && 
				(this.edadCalculadaPorCuotas() < 65)	
		;
	}
	

}
