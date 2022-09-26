package bancos.y.prestamos;

public class CreditoPersonal extends SolicitudDeCredito {

	@Override
	public boolean esSolicitudAceptable() {
		float sueldoMenosEl70 = cliente.getSueldoNetoMensual() - cliente.getSueldoNetoMensual() *70 /100;
		return ((cliente.getSueldoNetoAnual() > 15000) && (sueldoMenosEl70 > this.montoAPagarPorMonto()));
	}
	
}
