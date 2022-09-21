package ejercicio2;

import java.time.LocalTime;

public class Actividad {
	
	private DiaDeLaSemana dia;
	private LocalTime horarioDeInicio;
	private int duracionDeActividad;
	private Deporte deporte;
	
	public Actividad(DiaDeLaSemana dia, LocalTime horarioDeInicio, int duracionDeActividad, Deporte deporte) {
		this.dia = dia;
		this.horarioDeInicio = horarioDeInicio;
		this.duracionDeActividad = duracionDeActividad;
		this.deporte = deporte;
	}
	
	public DiaDeLaSemana getDia() {
		return dia;
	}
	public LocalTime getHorarioDeInicio() {
		return horarioDeInicio;
	}
	public int getDuracionDeActividad() {
		return duracionDeActividad;
	}
	public Deporte getDeporte() {
		return deporte;
	}
	
	public int getCosto() {
		
		if (this.dia == DiaDeLaSemana.LUNES || this.dia == DiaDeLaSemana.MARTES || this.dia == DiaDeLaSemana.MIERCOLES) {
			return 500 + (200*deporte.getComplejidad());
		}
		else {
			return 1000 + (200*deporte.getComplejidad());
		}
	}
	
	
	
	
}
