package concurso.src;

public abstract class EstadoDeServidor {
	
	public abstract void unirParticipante(Servidor servidor, IParticipante participante) throws Exception;
	public abstract void verificarRespuesta(String pregunta, String respuesta, IParticipante participante, Servidor servidor) throws Exception;
	protected abstract void finalizarJuego(Servidor servidor);
}
