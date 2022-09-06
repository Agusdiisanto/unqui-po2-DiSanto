package equipo.de.trabajo;

import java.util.ArrayList;
import java.util.List;

public class EquipoDeTrabajo {
	
	private String nombreDelEquipo;
	private List<Persona> integrantes = new ArrayList<Persona>();
	
	public EquipoDeTrabajo(String nombreDelEquipo) {
		this.nombreDelEquipo = nombreDelEquipo;
	}

	public void addIntegrante(Persona personaAgreagar) {
		integrantes.add(personaAgreagar);
	}
	
	public String getNombreDelEquipo() {
		return nombreDelEquipo;
	}
	
	public int promedioDeEdadIntegrantes() {
		
		int totalDePromedio = 0;
		for (Persona persona : integrantes) {
			totalDePromedio += persona.edad();
		}
		return (totalDePromedio / integrantes.size()) ;
	}
	
}
