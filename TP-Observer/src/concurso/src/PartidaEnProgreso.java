package concurso.src;

public class PartidaEnProgreso extends EstadoDeServidor {

	@Override
	public void unirParticipante(Servidor servidor, IParticipante participante) {
		throw new RuntimeException("El juego está en proceso, espere a la siguiente partida");
	}

	@Override
	public void verificarRespuesta(String pregunta, String respuesta, IParticipante participante, Servidor servidor)
			throws Exception {
		if ( servidor.esRespuestaCorrecta(pregunta, respuesta )) {
			
			participante.pasarASiguientePregunta();
			servidor.sumarPuntajeAParticipante(participante);
			servidor.notificarRespuestaCorrectaDe(participante, pregunta);
		} else {
			
			servidor.notificar(participante, "Respuesta incorrecta, vuelve a intentarlo");				
		}
	}

	@Override
	protected void finalizarJuego(Servidor servidor) {
		servidor.setEstado(new PartidaFinalizada());
	}

}
