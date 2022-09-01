package ejercicio10;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
	

	private String nombre;
	private LocalDate fechaDeNacimiento;
	
	
	
	public Persona(String nombre, LocalDate fechaDeNacimiento) {
		this.nombre = nombre;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public String getNombre() {
		return nombre;
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
