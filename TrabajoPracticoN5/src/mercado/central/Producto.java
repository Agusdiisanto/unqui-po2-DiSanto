package mercado.central;

public class Producto implements AutoServicio {
	
	private double monto;

	public Producto(double monto) {
		super();
		this.monto = monto;
	}

	public double getMonto() {
		return monto;
	}


	@Override
	public double abonarProducto() {
		// TODO Auto-generated method stub
		return this.getMonto();
	}
	
	
	
}
