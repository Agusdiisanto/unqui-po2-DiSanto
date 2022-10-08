package publicaciones.src;

import java.util.ArrayList;
import java.util.List;

public class Investigador implements ISubscripcion{
	
	private List<ArticuloCientifico> articulosDeInteres;
	private List<String> intereses;
	private Sistema publisher;
	
	public Investigador(Sistema publisher, List<String> interes) {
		this.setPublisher(publisher);
		this.setIntereses(interes);
		this.setArticulosDeInteres(new ArrayList<ArticuloCientifico>());
	}
	
	public List<ArticuloCientifico> getArticulosDeInteres() {
		return articulosDeInteres;
	}

	public void setArticulosDeInteres(List<ArticuloCientifico> articulosDeInteres) {
		this.articulosDeInteres = articulosDeInteres;
	}

	public List<String> getIntereses() {
		return intereses;
	}

	public void setIntereses(List<String> intereses) {
		this.intereses = intereses;
	}

	public Sistema getPublisher() {
		return publisher;
	}

	public void setPublisher(Sistema publisher) {
		this.publisher = publisher;
	}

	@Override
	public void notificarAlInvestigador(Sistema sistema, ArticuloCientifico nuevoArticulo) {
		if(this.esDeInteres(nuevoArticulo)) {
			this.addArticuloDeInteres(nuevoArticulo);
		}
	}
	
	public boolean esDeInteres(ArticuloCientifico articulo) {
		
		boolean tieneInteresDeTipo = this.getArticulosDeInteres().stream().anyMatch(c -> c.equals(articulo.getTipoDeArticulo()));
		boolean tieneInteresDeTitulo = this.getArticulosDeInteres().stream().anyMatch(c -> c.equals(articulo.getTitulo()));
		boolean tieneInteresDeLugar = this.getArticulosDeInteres().stream().anyMatch(c -> c.equals(articulo.getLugar()));
		
		return tieneInteresDeTipo || tieneInteresDeTitulo ||  tieneInteresDeLugar;
	}

	private void addArticuloDeInteres(ArticuloCientifico nuevoArticulo) {
		this.getArticulosDeInteres().add(nuevoArticulo);
	}
		
}
	