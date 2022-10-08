package fyleSystem.src;

import java.time.LocalDate;


public class Archivo implements FyleSystem {
	
	private int size;
	private String nombre;
	private LocalDate ultimaFechaDeModificacion;
	
	public Archivo(int size, String nombre, LocalDate ultimaFechaDeModificacion) {
		super();
		this.size = size;
		this.nombre = nombre;
		this.ultimaFechaDeModificacion = ultimaFechaDeModificacion;
	}
	
	public int getSize() {
		return size;
	}
	public String getNombre() {
		return nombre;
	}
	public LocalDate getUltimaFechaDeModificacion() {
		return ultimaFechaDeModificacion;
	}
	
	@Override
	public int totalSize() {
		// TODO Auto-generated method stub
		return this.getSize();
	}
	@Override
	public void printStructure() {
		// TODO Auto-generated method stub
		System.out.println(this.getNombre());
	}
	
	@Override
	public FyleSystem lastModified() {
		// TODO Auto-generated method stub
		return this;
	}
	@Override
	public FyleSystem oldestElement() {
		// TODO Auto-generated method stub
		return this;
	}
	
	
	
}
