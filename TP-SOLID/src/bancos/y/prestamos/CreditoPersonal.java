package bancos.y.prestamos;

public class CreditoPersonal extends SolicitudDeCredito {

	public CreditoPersonal(Cliente cliente, float montoSolicitado, int cuotasAPagar) {
		super(cliente, montoSolicitado, cuotasAPagar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean esSolicitudAceptable() {
		float sueldoMenosEl70 = cliente.getSueldoNetoMensual() - cliente.getSueldoNetoMensual() *70 /100;
		return ((cliente.getSueldoNetoAnual() > 15000) && (sueldoMenosEl70 > this.montoAPagarPorMonto()));
	}
	
}
