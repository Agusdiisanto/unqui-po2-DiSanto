package bancos.y.prestamos;

public class Cliente {
	
	String nombreYApellido;
	String direccion;
	int edad;
	double sueldoNetoMensual;
	
	public Cliente(String nombreYApellido, String direccion, int edad, double sueldoNetoMensual) {
		this.nombreYApellido = nombreYApellido;
		this.direccion = direccion;
		this.edad = edad;
		this.sueldoNetoMensual = sueldoNetoMensual;
	}
	
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public int getEdad() {
		return edad;
	}
	public double getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public double getSueldoNetoAnual() {
		return getSueldoNetoMensual() * 12 ;
	}
	
	public void recibirElEfectivoOtorgado(double efectivoOtorgado) {
		this.sueldoNetoMensual += efectivoOtorgado;
	}
	 
}
