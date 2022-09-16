package agencia.clase;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Agenda {
	
	private List<String> nombres = new ArrayList<String>();
	
	public Agenda agregarNombre(String nombreAgregar) {
		this.nombres.add(nombreAgregar);
		return this;
	}
	
	public List<String> filtrar(String nombreAFiltrar) {
		/*
		List<String>nombresFiltrados = new ArrayList<String>();
		
		for (String nombre : nombres) {
			if (nombre.startsWith(nombreAFiltrar)) {
				nombresFiltrados.add(nombre);
			}
		}
		*/
		return (nombres.stream().filter(s -> s.startsWith(nombreAFiltrar))).collect(Collectors.toList());
	}
	
	public boolean tieneAlMenosUnNombreQueEmpiezaCon(String nombreABuscar) {
		/*
		int cantidadDeElementos = nombres.size();
		int numeroDeListado = 0 ;
		String elemento = nombres.get(numeroDeListado); 
		
		while (cantidadDeElementos < 0 && !elemento.startsWith(nombreABuscar)) {
			numeroDeListado ++;
			cantidadDeElementos -= 1;
		}
		*/
		return nombres.stream().anyMatch(s -> s.startsWith(nombreABuscar));
		
	}
	
	public boolean todosEmpiezanCon(String nombreABuscar) {
		/*
		int cantidadDeElementos = nombres.size();
		int numeroDeListado = 0 ;
		String elemento = nombres.get(numeroDeListado); 
		
		while (cantidadDeElementos < 0 && elemento.startsWith(nombreABuscar)) {
			numeroDeListado ++;
			cantidadDeElementos -= 1;
		}
		*/
	    return nombres.stream().allMatch(s -> s.startsWith(nombreABuscar));
	}
	
	public int cantidadDeNombres() {
		return nombres.size();
	}	
	
	public int cantidadDeNombresFiltradosPorLetra(String nombreAFiltrar) {
		return (this.filtrar(nombreAFiltrar)).size();
	}
	
	public void printAll() {
		for (String nombre : nombres) {
			System.out.println(nombre);
		}
	}
	
	/*
	 *  PARTE IMPORTANTE PARA LOS TEST
	 *  
	 *  Setup, test , 
	 *  
	 * 
	 * 
	 * 
	 */
	
	

}
