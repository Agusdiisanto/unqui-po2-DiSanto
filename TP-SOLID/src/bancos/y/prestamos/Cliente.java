package bancos.y.prestamos;

public class Cliente {
	
	String nombreYApellido;
	String direccion;
	int edad;
	float sueldoNetoMensual;
	
	public Cliente(String nombreYApellido, String direccion, int edad, float sueldoNetoMensual) {
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
	public float getSueldoNetoMensual() {
		return sueldoNetoMensual;
	}
	
	public float getSueldoNetoAnual() {
		return getSueldoNetoMensual() * 12 ;
	}
	
	public void recibirElEfectivoOtorgado(float efectivoOtorgado) {
		this.sueldoNetoMensual += efectivoOtorgado;
	}
	 
}
