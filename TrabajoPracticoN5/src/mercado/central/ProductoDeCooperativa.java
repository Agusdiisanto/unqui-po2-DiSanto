package mercado.central;

public class ProductoDeCooperativa extends Producto implements AutoServicio {

	private int descuento;

	public ProductoDeCooperativa(double monto, int descuento) {
		super(monto);
		this.descuento = descuento;
	}

	public int getDescuento() {
		return descuento;
	}
	
	@Override
	public double getMonto() {
		return ((super.getMonto() - (super.getMonto()) * this.getDescuento() / 100));
	}
	
		
}
 