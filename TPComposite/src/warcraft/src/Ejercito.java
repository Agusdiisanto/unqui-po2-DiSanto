package warcraft.src;

import java.util.ArrayList;
import java.util.List;

public class Ejercito implements Personaje{
	
	List<Personaje> personajes = new ArrayList<Personaje>();
	
	public List<Personaje> getPersonajes() {
		return personajes;
	}
	
	public void AgregarPersonajes(Personaje personajeAgregar) {
		this.getPersonajes().add(personajeAgregar);
	}

	public void SacarPersonajes(Personaje personajeAgregar) {
		this.getPersonajes().remove(personajeAgregar);
	}

	@Override
	public void caminar() {
		// TODO Auto-generated method stub
		
	}
}
