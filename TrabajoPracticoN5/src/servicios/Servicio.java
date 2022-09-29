package servicios;

import mercado.central.AutoServicio;

public class Servicio implements Factura , AutoServicio{

	private double costoPorUnidad;
	private int cantidadDeUnidades;
	private AgenciaRecaudadora agencia;
	
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
		agencia.registrarPago(this);
		return this.getCostoPorUnidad()*this.getCantidadDeUnidades();
	}

	@Override
	public double abonarProducto() {
		agencia.registrarPago(this);
		return this.montoAPagar();
	}

}
