package concurso.src;

public interface IParticipante {
	 
	public void  unirseAPartida(Servidor servidor) throws Exception;
	public void solicitarUnirseAPartida(Servidor servidor) throws Exception;
	public void responderPregunta(String respuesta) throws Exception;
	public void pasarASiguientePregunta();
	public void recibirNuevaNotificacion(String notificacion);
	public String  getNombre() ;
}
