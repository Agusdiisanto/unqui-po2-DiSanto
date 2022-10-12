package encuentros.deportivos.src;

import java.util.List;

public class Servidor implements ISportListener {
		
	private List<Partido> partidos;
	private List<String> intereses;
	
	public List<Partido> getPartidos() {
		return partidos;
	}
	
	public List<String> getIntereses() {
		return intereses;
	}
	
	@Override
	public void subscribir(Aplicacion aplicacion) {
		aplicacion.agregarNuevaSubscripcion(this);
	}
	
	@Override
	public void registrarNuevoPartido(Partido partido) {
		if(this.esPartidoDeInteres(partido)) {
			this.getPartidos().add(partido);
		}
	}
	
	public void agregarPartido(Partido partido) {
		this.getPartidos().add(partido);
	}
	
	public void agregarInteres(String interes) {
		this.getIntereses().add(interes);
	}
	
	private boolean esPartidoDeInteres(Partido partido) {
		for (String interes : this.getIntereses()) {
			if (partido.esDeInteres(interes)) {
				return true;
			}
		}
		return false;
	}
	
	
}
