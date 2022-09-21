package ejercicio2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SecretariaDeportesMunicipio {
	List <Actividad> actividades = new ArrayList<Actividad>();
	
	public List<Actividad> getActividades() {
		return actividades;
	}

	public SecretariaDeportesMunicipio incorporarActividad(Actividad actividadNueva) {
		actividades.add(actividadNueva);
		return this;
	}
	
	public List<Actividad> filtroDeActividad(Deporte deporteAFiltrar){
		return actividades.stream().filter(t -> (t.getDeporte() == deporteAFiltrar)).collect(Collectors.toList());
	}
	
	public List<Actividad> filtroDeActividadPorComplejidad(int nivelDeComplejidad){
		return actividades.stream().filter(t -> (t.getDeporte().getComplejidad() == nivelDeComplejidad)).collect(Collectors.toList());
	}
	
	public int cantidadDeHorasTotaleDeDeportes() {
		return actividades.stream().mapToInt(t -> t.getDuracionDeActividad()).sum();
	}
	
	public Actividad actividadDeporteConMenorCostoDeTiempo(Deporte deporteConInteres) {
		return this.filtroDeActividad(deporteConInteres).
				stream().min
				(Comparator.comparingInt(Actividad :: getCosto)).get();
	}
	
    /**
     * Imprime todas las actividades.
     */
    public void imprimirTodasLasActividades() {
        this.getActividades()
            .stream()
            .forEach(act -> System.out.println(act.toString()));
    }

    /**
     * Crea un Map con las actividades menos costosas de cada deporte.
     * 
     * @author juan manuel
     * @return Map - Un mapa con los deportes como clave y su actividad menos costosa como valor.
     */
    public Map<Deporte, Actividad> actividadesConMenorCosto() {
        Map<Deporte, Actividad> map = new HashMap<Deporte, Actividad>();
        
        for(Actividad act : this.getActividades()){
           Deporte deporte = act.getDeporte();
             if(!map.containsKey(deporte)){
            	 Actividad actividadMasBarata = this.actividadDeporteConMenorCostoDeTiempo(deporte);
                 map.put(deporte, actividadMasBarata);
             }
        }

        return map;
    }
	
	
	
}  
  


