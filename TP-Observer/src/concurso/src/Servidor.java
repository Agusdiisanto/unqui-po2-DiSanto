package concurso.src;

import java.util.List;
import java.util.Map;

public class Servidor {
		
	private List<IParticipante> participantes;
	private List<IParticipante> participantesEnEspera;
	private List<String>preguntas;
	private Map<String,String>respuestas;
	private Map<IParticipante, Integer> puntaje;
	private EstadoDeServidor estado;
	

	public List<IParticipante> getParticipantes() {
		return participantes;
	}
	public List<IParticipante> getParticipantesEnEspera() {
		return participantesEnEspera;
	}
	public List<String> getPreguntas() {
		return preguntas;
	}
	public Map<String,String> getRespuestas() {
		return respuestas;
	}
	
	public Map<IParticipante, Integer> getPuntaje() {
		return puntaje;
	}

	public EstadoDeServidor getEstado() {
		return estado;
	}
	
	public void setParticipantes(List<IParticipante> participantes) {
		this.participantes = participantes;
	}
	public void setParticipantesEnEspera(List<IParticipante> participantesEnEspera) {
		this.participantesEnEspera = participantesEnEspera;
	}
	public void setPreguntas(List<String> preguntas) {
		this.preguntas = preguntas;
	}
	public void setRespuestas(Map<String, String> respuestas) {
		this.respuestas = respuestas;
	}
	public void setPuntaje(Map<IParticipante, Integer> puntaje) {
		this.puntaje = puntaje;
	}
	public void setEstado(EstadoDeServidor estado) {
		this.estado = estado;
	}
	
	public void agregarParticipante(IParticipante participante) {
			this.getParticipantes().add(participante);
			this.getPuntaje().put(participante, 0);
	}
	
	public void agregarAlJugadorEnEspera(IParticipante participante) {
		this.getParticipantesEnEspera().add(participante);
	}
	
	public void otorgarPreguntasAParticipantes() throws Exception {
		for (IParticipante participante : participantes) {
			participante.unirseAPartida(this);
		}
	}
	
	public void notificar(IParticipante participante,String notificiacion) {
		participante.recibirNuevaNotificacion(notificiacion);
	}
	
	public void sumarPuntajeAParticipante(IParticipante participante) throws Exception {
		
		int puntajeActual = this.getPuntaje().get(participante);
		this.getPuntaje().put(participante, puntajeActual+1);
		
		  	if (this.esGanador(participante)) {
				this.finalizarJuego();
				this.notificarATodosElGanador(participante);
		  	    }
	}
	
	public void unirParticipante(Participante participantex) throws Exception {
		this.getEstado().unirParticipante(this, participantex);		
	}
	
	public void notificarATodosElGanador(IParticipante participanteGanador) {
		for (IParticipante participante : this.getParticipantes()) {
			participante.recibirNuevaNotificacion("El ganador es " + participante.getNombre() + ". Juego finalizado");
		}
	}
	
	public boolean esGanador(IParticipante participante) {
			return this.getPuntaje().get(participante) == 5;
	}
	
	public void finalizarJuego() {
		 this.getEstado().finalizarJuego(this);	
	}
	
	public boolean esRespuestaCorrecta(String pregunta, String respuesta) {
			return this.getRespuestas().get(pregunta).equals(respuesta);
	}
	
	public void notificarRespuestaCorrectaDe(IParticipante participanteX, String pregunta) {
			for(IParticipante participante : this.getParticipantes()) {
				participante.recibirNuevaNotificacion("El participante " + participanteX.getNombre() + " respondió bien la pregunta " + pregunta);
			}
	}
	
	public void responderPregunta(String pregunta, String respuesta, IParticipante participante) throws Exception {
		this.getEstado().verificarRespuesta(pregunta, respuesta, participante, this);		
	}

	
}
