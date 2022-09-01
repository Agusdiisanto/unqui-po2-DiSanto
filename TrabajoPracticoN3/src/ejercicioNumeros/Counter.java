package ejercicioNumeros;

import java.util.ArrayList;
import java.util.List;

public class Counter {
	
   private List<Integer> numeros = new ArrayList<Integer>();
	
	public void addNumero(int numeroAgregar) {
		numeros.add(numeroAgregar);
	}
	
	public int cantidadDeNumerosPares(){
		
		int contador = 0;
		for (Integer numero : numeros){
			
			if(this.esNumeroPar(numero)) {
				contador += 1;
			}
		}
		return contador;
	}
	
	public boolean esNumeroPar(int numeroAComparar){
		return (numeroAComparar % 2 == 0);
	}
	
	public int cantidadDeNumerosImpares(){
		
		int contador = 0;
		for (Integer numero : numeros){
			
			if(!this.esNumeroPar(numero)) {
				contador += 1;
			}
		}
		return contador;
	}
	
	public int cantidadDeMultiplos(int numeroASerMultiplo){
		
		int contador = 0;
		
		for (Integer numero : numeros) {
			if (this.esNumeroMultiplo(numero,numeroASerMultiplo)) {
				contador += 1;
			}
		}
		return contador;	
	}
	
	public boolean esNumeroMultiplo(int numeroARevisar,int numeroASerMultiplo) {
		return ((numeroARevisar & numeroASerMultiplo) == 0); 
	}
	

	public int numeroConMayorDigitosPares(List<Integer> numerosARevisar) {
		
		int numeroAGuardar = 0;
		
		for (Integer numeroAVer : numerosARevisar) {
			
			if (this.esMayor(numeroAGuardar,this.cantidadDeDigitosPares(numeroAVer))) {
				numeroAGuardar = this.cantidadDeDigitosPares(numeroAVer);
			}
			
		}
		return numeroAGuardar;
	}
	
	public int cantidadDeDigitosPares(int numero) {
		int numeroRestante = numero;
		int cantidadDeDigitos = 0;
		
		while (numeroRestante > 0) {
			
			if (this.esNumeroPar(numeroRestante % 10)) {
				cantidadDeDigitos ++;
			}	
			
			numeroRestante = numeroRestante / 10;
		}
		return cantidadDeDigitos;
	}
	
	
	public boolean esMayor(int numero1 ,int numero2) {
		return (numero2 > numero1);
	}
	
	public int numeroMultiploMasAlto(int x, int y) {
		
		int numeroADevolver = 0;
		
		if (y % x == 0) {
			numeroADevolver = y*100 + y*10 + y;
		}
		else if (x % y == 0) {
			numeroADevolver = x*100 + x*10 + x;
		}
		else {
			numeroADevolver = -1;
		}	
		return numeroADevolver;
	}
	
	
	
	
}
