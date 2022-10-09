package publicaciones.src;

import java.util.List;

public class Sistema {
	
	private List<ArticuloCientifico> articulos;
	private List<ISubscripcion> subscripciones;
	
	private void notificarNuevoArticulo(ArticuloCientifico articulo) {	
		for(ISubscripcion subscriber : this.getSubscripciones()) {
			subscriber.notificarAlInvestigador(this, articulo);
		}
	}
	
	public void cargarAlSistemaElArticulo(ArticuloCientifico articulo) {	
		articulos.add(articulo);
		this.notificarNuevoArticulo(articulo);
	}

	public List<ArticuloCientifico> getArticulos() {
		return articulos;
	}

	public List<ISubscripcion> getSubscripciones() {
		return subscripciones;
	}

	public void setArticulos(List<ArticuloCientifico> articulos) {
		this.articulos = articulos;
	}

	public void setSubscripciones(List<ISubscripcion> subscripciones) {
		this.subscripciones = subscripciones;
	}
	
	
	public void susbscribirInvestigador(ISubscripcion unSuscriptor) {
		
		if (!this.estaSubscripto(unSuscriptor)) {
			subscripciones.add(unSuscriptor);
		}
	}
	
	public boolean estaSubscripto(ISubscripcion unSuscriptor) {
		return subscripciones.contains(unSuscriptor);
	}
	
	public void desusbcribirInvestigador(ISubscripcion unSuscriptor) {
		if (this.estaSubscripto(unSuscriptor)) {
			subscripciones.remove(unSuscriptor);
		}
	}
	
}
