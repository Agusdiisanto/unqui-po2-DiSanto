package concurso.src;

public class EsperandoInicioDePartida extends EstadoDeServidor {

	@Override
	public void unirParticipante(Servidor servidor, IParticipante participante) throws Exception {
			if ( servidor.getParticipantes().size() == 4 )  {
				servidor.agregarParticipante(participante);
				servidor.otorgarPreguntasAParticipantes();
				servidor.setEstado(new PartidaEnProgreso());
		}
		else {
			servidor.agregarParticipante(participante);
		}
	}

	@Override
	public void verificarRespuesta(String pregunta, String respuesta, IParticipante participante, Servidor servidor)
			throws Exception {
		throw new RuntimeException("La partida todavia no ha iniciado");		

	}

	@Override
	protected void finalizarJuego(Servidor servidor) {
		throw new RuntimeException("La partida todavia no ha iniciado");
	}

}
