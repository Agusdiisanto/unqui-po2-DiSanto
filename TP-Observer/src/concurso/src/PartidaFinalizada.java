package concurso.src;

public class PartidaFinalizada extends EstadoDeServidor {

	@Override
	public void unirParticipante(Servidor servidor, IParticipante participante) {
		throw new RuntimeException("La partida ya ha finalizado");		

	}

	@Override
	public void verificarRespuesta(String pregunta, String respuesta, IParticipante participante, Servidor servidor)
			throws Exception {
		throw new RuntimeException("La partida ya ha finalizado");		

	}

	@Override
	protected void finalizarJuego(Servidor servidor) {
		throw new RuntimeException("La partida ya ha finalizado");		

	}

}
