package equipo.de.trabajo;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	
	private String nombre;
	private String apellido;
	private LocalDate fechaDeNacimiento;
	
	public Persona(String nombre, LocalDate fechaDeNacimiento, String apellido) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}

	public LocalDate getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public int edad() {
		LocalDate fechaHoy = LocalDate.now();
		Period periodo = Period.between(fechaDeNacimiento, fechaHoy);
		return periodo.getYears();
	}
	
	public boolean esMenorQue(Persona personaAComparar) {
		return (this.edad() < personaAComparar.edad());
	}
	
	
	
	

}
