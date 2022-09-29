package cliente;

public interface IMensaje {
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo);
	public void borrarCorreo(Correo correo);
}
