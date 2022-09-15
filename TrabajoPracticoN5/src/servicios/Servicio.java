package servicios;

import mercado.central.AutoServicio;

public class Servicio implements Factura , AutoServicio{

	private double costoPorUnidad;
	private int cantidadDeUnidades;
	
	public Servicio(double costoPorUnidad, int cantidadDeUnidades) {
		this.costoPorUnidad = costoPorUnidad;
		this.cantidadDeUnidades = cantidadDeUnidades;
	}

	public double getCostoPorUnidad() {
		return costoPorUnidad;
	}

	public int getCantidadDeUnidades() {
		return cantidadDeUnidades;
	}

	@Override
	public double montoAPagar() {
		// TODO Auto-generated method stub
		return this.getCostoPorUnidad()*this.getCantidadDeUnidades();
	}

	@Override
	public double abonarProducto() {
		// TODO Auto-generated method stub
		return this.montoAPagar();
	}

}
