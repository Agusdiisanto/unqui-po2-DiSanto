package encuentros.deportivos.src;

import java.util.ArrayList;
import java.util.List;

public class Aplicacion {
		
	private List<Partido> partidos;
	private List<ISportListener> subscripciones;
	
	public Aplicacion() {
		partidos = new ArrayList<Partido>();
		subscripciones = new ArrayList<ISportListener>();
	}

	private  List<Partido> getPartidos() {
		return partidos;
	}

	private List<ISportListener> getSubscripciones() {
		return subscripciones;
	}
	
	public void addPartido(Partido partido) {
		this.getPartidos().add(partido);
	}
	
	public void agregarNuevoPartido(Partido partido) {
		 this.addPartido(partido);
		 this.notificarNuevoPartido(partido);
	}
	
	public void notificarNuevoPartido(Partido partidoANotificar) {
		  for (ISportListener listener : this.getSubscripciones()) {
			    listener.registrarNuevoPartido(partidoANotificar);
		}
	}
	
	public void agregarNuevaSubscripcion(ISportListener susbriptor) {
		this.getSubscripciones().add(susbriptor);
	}
	
}
