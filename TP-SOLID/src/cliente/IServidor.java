package cliente;

import java.util.List;

public interface IServidor {
	
	public List<Correo>recibirNuevos(String user,String pass);

	public void conectar(String usuario, String pass);
	
	public void enviar(Correo correo);

}
