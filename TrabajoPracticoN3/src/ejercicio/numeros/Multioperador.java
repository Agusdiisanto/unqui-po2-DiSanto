package ejercicio.numeros;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	
	private List<Integer> numeros = new ArrayList<Integer>();
		
	public void addNumero(int numeroAgregar) {
			numeros.add(numeroAgregar);
	}
	
	public int sumarNumeros() {
		
		int totalDeSuma = 0;
		
		for (Integer numero : numeros) {
			totalDeSuma +=  numero; 
		}
		
		return totalDeSuma;		
	}
	
	public int multiplicarNumeros() {
		
		int totalDeMultiplicar = 1;
		
		for (Integer numero : numeros) {
			totalDeMultiplicar = totalDeMultiplicar * numero;
		}
		
		return totalDeMultiplicar;		
	}
	
	public int restarNumeros() {
		
		int totalDeResta = numeros.get(1);
		
		for (Integer numero : numeros) {
			totalDeResta = totalDeResta - numero;
		}
		return totalDeResta;
	}
	
	
	
	
	

}
