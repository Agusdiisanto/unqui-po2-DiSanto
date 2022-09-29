package bancos.y.prestamos;

public class Garantia {
	
	String descripcion;
	float valorFiscal;
	String direccion;
	
	public Garantia(String descripcion, float valorFiscal, String direccion) {
		this.descripcion = descripcion;
		this.valorFiscal = valorFiscal;
		this.direccion = direccion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public float getValorFiscal() {
		return valorFiscal;
	}
	public String getDireccion() {
		return direccion;
	}
}
