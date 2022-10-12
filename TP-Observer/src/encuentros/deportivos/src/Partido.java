package encuentros.deportivos.src;

import java.util.ArrayList;
import java.util.List;

public class Partido {
		
		private String resultado;
		private List<String> contricantes;
		private String deporte;
		
	
		public Partido(String resultado, String deporte) {
			this.resultado = resultado;
			this.deporte = deporte;
			this.contricantes = new ArrayList<String>();
		}
		
		public String getResultado() {
			return resultado;
		}
		public List<String> getContricantes() {
			return contricantes;
		}
		public String getDeporte() {
			return deporte;
		}
	
		public void agregarContricante(String contricante) {
			this.getContricantes().add(contricante);
		}
		public void eliminarContricante(String contricante) {
			this.getContricantes().remove(contricante);
		}

		public boolean esDeInteres(String interes) {
			
			return 
					(this.getResultado() == interes) || 
					(this.getDeporte() == interes) || 
					(this.getContricantes().contains(interes));
		}
}
