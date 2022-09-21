package ejercicio1;

public enum Color {
	
	ROJO(1, "GRIS"),GRIS(2, "AMARRILO"), AMARILLO(3, "MIEL"), MIEL(4, "ROJO");
	
	int nivelDeRiesgo;
	String proximoColor;

	Color(int nivelDeRiesgoAPoner, String proximoColorAPoner){
		nivelDeRiesgo = nivelDeRiesgoAPoner;
		proximoColor = proximoColorAPoner;
	}
	
	public String getProximoColor() {
		return this.proximoColor;
	}
	
	public int getNivelDeRiesgo() {
		return this.nivelDeRiesgo;
	}
}
