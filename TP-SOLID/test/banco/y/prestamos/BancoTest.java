package banco.y.prestamos;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import bancos.y.prestamos.Banco;
import bancos.y.prestamos.Cliente;
import bancos.y.prestamos.CreditoHipotecario;
import bancos.y.prestamos.CreditoPersonal;
import bancos.y.prestamos.Garantia;
import bancos.y.prestamos.SolicitudDeCredito;


public class BancoTest {
	
	Banco bancoHCBC;
	Cliente cliente1;
	Cliente cliente2;
	Cliente cliente3;
	SolicitudDeCredito creditoPersonal;
	SolicitudDeCredito creditoPersonal2;
	Garantia casa;
	SolicitudDeCredito creditoHipotecario;
	
	@BeforeEach
	public void setUp() {
		casa = new Garantia("Casa",70000,"Quilmes");
		bancoHCBC = new Banco();
		cliente1 = new Cliente("Agustin Di Santo", "Quilmes", 19, 12000);
		cliente3 = new Cliente("Matias Di Santo","Quilmes",26,100);
		cliente2 = new Cliente("Jose Di Santo", "Quilmes", 50, 20000);
		creditoPersonal = new CreditoPersonal(cliente1, 1000, 3) ;
		creditoHipotecario = new CreditoHipotecario(cliente2, 5000, 1,casa);
		creditoPersonal2 =  new CreditoPersonal(cliente3, 1000000, 3) ;
	}
	
	@Test 
	public void test01_UnBancoAgregaUnCliente() {
		bancoHCBC.agregarNuevoCliente(cliente1);
		assertTrue(bancoHCBC.tieneAlCliente(cliente1));
		assertEquals(1,bancoHCBC.cantidadDeClientes());
	}
	
	@Test
	public void test02_unBancoRegistraLasSolicitudesDeCredito() {
		bancoHCBC.registrarSolicitud(creditoPersonal);
		assertEquals(1,bancoHCBC.cantidadDeSolicitudes());
	}
	
	@Test
	public void test03_unBancoIniciaUnTramiteDeSolicitudConElClienteSolicitado() {
		bancoHCBC.iniciarTramiteDeSolicitudDeCreditoPara(creditoPersonal);
		
		assertEquals(1,bancoHCBC.cantidadDeSolicitudes());
		assertEquals(13000,cliente1.getSueldoNetoMensual());
	}
	
	@Test
	public void test04_cuandoUnBancoRechazaUnaSolicitudDeCredito() {
		bancoHCBC.iniciarTramiteDeSolicitudDeCreditoPara(creditoPersonal2);
		
		assertTrue(bancoHCBC.noHayRegistrosDeCreditos());
		assertEquals(100,cliente3.getSueldoNetoMensual());
	}
	
	@Test
	public void test05_unBancoIniciaUnTramiteDeSolicitudHipotecario() {
		bancoHCBC.iniciarTramiteDeSolicitudDeCreditoPara(creditoHipotecario);
		assertEquals(25000,cliente2.getSueldoNetoMensual());
	}
	
	@Test
	public void test06_unBancoSabeElMontoTotalADesembolsar() {
		bancoHCBC.iniciarTramiteDeSolicitudDeCreditoPara(creditoHipotecario);
		bancoHCBC.iniciarTramiteDeSolicitudDeCreditoPara(creditoPersonal);
		bancoHCBC.iniciarTramiteDeSolicitudDeCreditoPara(creditoPersonal2);
		
		assertEquals(6000,bancoHCBC.montoTotalADesembolsar());
	}	
}



