package bancos.y.prestamos;

public class CreditoPersonal extends SolicitudDeCredito {

	public CreditoPersonal(Cliente cliente, float montoSolicitado, int cuotasAPagar) {
		super(cliente, montoSolicitado, cuotasAPagar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esSolicitudAceptable() {
		double sueldoMenosEl70 = this.getCliente().getSueldoNetoMensual() - (this.getCliente().getSueldoNetoMensual() *70 /100);
		return ((this.getCliente().getSueldoNetoAnual() > 15000) && (sueldoMenosEl70 > this.montoAPagarPorMonto()));
	}
	
}
