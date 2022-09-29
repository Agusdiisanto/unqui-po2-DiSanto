package bancos.y.prestamos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private List <Cliente> clientes = new ArrayList<Cliente>();
	private List <SolicitudDeCredito> creditosSolicitados = new ArrayList<SolicitudDeCredito>();

	public List<Cliente> getClientes() {
		return clientes;
	} 
	
	public Banco agregarNuevoCliente(Cliente clienteNuevo){
		clientes.add(clienteNuevo);
		return this;		
	}
	
	public int cantidadDeClientes(){
		return clientes.size();
	}
	
	public int cantidadDeSolicitudes(){
		return creditosSolicitados.size();
	}
	
	public Banco registrarSolicitud(SolicitudDeCredito creditoARegistrar) {
		creditosSolicitados.add(creditoARegistrar);
		return this;
	}
	
	public void otorgarPrestamoACliente(Cliente cliente, float montoAOtorgar) {
		cliente.recibirElEfectivoOtorgado(montoAOtorgar);
	}
	
	public void iniciarTramiteDeSolicitudDeCreditoPara(Cliente unCliente,SolicitudDeCredito credito) {
		
		if(unCliente == credito.getCliente()) {
			if(credito.esSolicitudAceptable()) {
				this.registrarSolicitud(credito);
				this.otorgarPrestamoACliente(unCliente, credito.getMontoSolicitado());
			}
		}
	}
	
	public boolean noHayRegistrosDeCreditos() {
		return creditosSolicitados.isEmpty();
	}
	
	public boolean tieneAlCliente(Cliente unCliente) {
		return clientes.contains(unCliente);
	}
}
