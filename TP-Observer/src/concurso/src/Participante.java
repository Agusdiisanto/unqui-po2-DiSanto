package concurso.src;

import java.util.List;

public class Participante implements IParticipante {
	
	private String nombre;
	private List<String> preguntas;
	private int preguntaActual;
	private List<String>notificaciones;
	private Servidor servidor;
	
	public Servidor getServidor() {
		return servidor;
	}

	public void setServidor(Servidor servidor) {
		this.servidor = servidor;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPreguntas(List<String> preguntas) {
		this.preguntas = preguntas;
	}

	public void setPreguntaActual(int preguntaActual) {
		this.preguntaActual = preguntaActual;
	}

	public void setNotificaciones(List<String> notificaciones) {
		this.notificaciones = notificaciones;
	}

	public List<String> getPreguntas() {
		return preguntas;
	}

	public int getPreguntaActual() {
		return preguntaActual;
	}

	public List<String> getNotificaciones() {
		return notificaciones;
	}

	@Override
	public void unirseAPartida(Servidor servidor) throws Exception {
		this.setPreguntas(servidor.getPreguntas());
		this.setPreguntaActual(0);
		this.setServidor(servidor);
	}

	@Override
	public void solicitarUnirseAPartida(Servidor servidor) throws Exception {
			servidor.unirParticipante(this);		
	}

	@Override
	public void responderPregunta(String respuesta) throws Exception {
		
		if	(this.getServidor() == null) {
			throw new RuntimeException("El jugador no está registrado");
		} 
		else {
			String pregunta = this.getPreguntas().get(preguntaActual);
			this.getServidor().responderPregunta(pregunta, respuesta, this);
		}
		
	}

	@Override
	public void pasarASiguientePregunta() {
		preguntaActual = preguntaActual + 1;
	}

	@Override
	public void recibirNuevaNotificacion(String notificacion) {
			this.getNotificaciones().add(notificacion);
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

}
