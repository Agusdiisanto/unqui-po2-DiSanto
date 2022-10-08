package fyleSystem.src;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio implements FyleSystem {
	
	private String nombre;
	private LocalDate fechaDeCreacion;
	private List<FyleSystem> contenido;
	   
	public Directorio(String nombre, LocalDate fechaDeCreacion) {
		super();
		this.nombre = nombre;
		this.fechaDeCreacion = fechaDeCreacion;
		this.contenido = new ArrayList<FyleSystem>();
	}

	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}

	public List<FyleSystem> getContenido() {
		return contenido;
	}

	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return this.getContenido().stream().mapToInt(fs -> fs.totalSize()).sum();
	}

	@Override
	public void printStructure() {
		// TODO Auto-generated method stub
		System.out.println(this.getNombre());
	}

	@Override
	public FyleSystem lastModified() {
		// TODO Auto-generated method stub
		return this.getContenido().get(0);
	}

	@Override
	public FyleSystem oldestElement() {
		// TODO Auto-generated method stub
		return this.getContenido().get(this.totalSize());
	}

	public void agregarContenido(FyleSystem contenidoAgregar) {
		contenido.add(contenidoAgregar);
	}
	
	public void eliminarContenido(FyleSystem contenidoAgregar) {
		contenido.remove(contenidoAgregar);
	}
	
	
	
}
