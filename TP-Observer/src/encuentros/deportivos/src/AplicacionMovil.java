package encuentros.deportivos.src;

import java.util.ArrayList;
import java.util.List;

public class AplicacionMovil  implements ISportListener{
		
	private List<String>resultadoInteres;
	private List<String>interes;
	
	public List<String> getResultadoInteres() {
		return resultadoInteres;
	}
	
	public List<String> getInteres() {
		return interes;
	}
	
	
	public AplicacionMovil() {
		resultadoInteres = new ArrayList<String>();
		interes = new ArrayList<String>();
	}

	@Override
	public void subscribir(Aplicacion aplicacion) {
		aplicacion.agregarNuevaSubscripcion(this);		
	}
	@Override
	public void registrarNuevoPartido(Partido partido) {
		if (this.esPartidoDeInteres(partido)) {
			this.agregarNuevoResultadoInteres(partido.getResultado());
		}
	}

	public void agregarNuevoInteres(String interes) {
		this.getInteres().add(interes);
	}
	
	public void agregarNuevoResultadoInteres(String resultado) {
		this.getResultadoInteres().add(resultado);
	}
	
	public boolean esPartidoDeInteres(Partido partido) {
		for (String interes : this.getInteres()) {
			if(partido.esDeInteres(interes)) {
				return true;
			}
		}
		return false;
	}
	
}
