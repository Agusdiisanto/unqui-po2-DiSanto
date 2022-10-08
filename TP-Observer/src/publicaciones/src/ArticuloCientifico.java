package publicaciones.src;

import java.util.ArrayList;
import java.util.List;

public class ArticuloCientifico {
	
	private String titulo;
	private List<String> autores;
	private List<String>filiaciones;
	private String tipoDeArticulo;
	private String lugar;
	private List<String> palabrasClaves;
	
	public ArticuloCientifico(String titulo, String tipoDeArticulo, String lugar) {
		super();
		this.titulo = titulo;
		this.tipoDeArticulo = tipoDeArticulo;
		this.lugar = lugar;
		autores = new ArrayList<String>();
		filiaciones = new ArrayList<String>();
		palabrasClaves = new ArrayList<String>();
	}
	
	
	public String getTitulo() {
		return titulo;
	}
	public List<String> getAutores() {
		return autores;
	}
	public List<String> getFiliaciones() {
		return filiaciones;
	}
	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}
	public String getLugar() {
		return lugar;
	}
	public List<String> getPalabrasClaves() {
		return palabrasClaves;
	}
	
	public void agregarNuevoAutor(String autorNuevo) {
		autores.add(autorNuevo);
	}
	
	public void agregarNuevaPalabraClave(String palabraClave) {
		palabrasClaves.add(palabraClave);
	}
	
	public void agregarNuevaFilacion(String filacion) {
		filiaciones.add(filacion);
	}
	
	public void eliminarrNuevoAutor(String autorNuevo) {
		autores.remove(autorNuevo);
	}
	
	public void eliminarNuevaPalabraClave(String palabraClave) {
		palabrasClaves.remove(palabraClave);
	}
	
	public void eliminarNuevaFilacion(String filacion) {
		filiaciones.remove(filacion);
	}
	
}	
