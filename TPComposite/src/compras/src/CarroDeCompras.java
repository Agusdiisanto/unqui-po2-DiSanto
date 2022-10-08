package compras.src;

import java.util.ArrayList;
import java.util.List;

public class CarroDeCompras {
	
	private List<Product> setElements;

	public List<Product> getSetElements() {
		return setElements;
	}
	
	
	
	public CarroDeCompras() {
		setElements = new ArrayList<Product>();
	}



	public int totalRounded() {
		return setElements.stream().mapToInt(p -> (int) p.getPrice()).sum();
	}
	 
	public float total() {
		
		float total = 0;
		for (Product product : setElements) {
			total += product.getPrice();
		}
		return total;
	}
	
	public void addElements(Product p) {
		setElements.add(p);
	}
	
	public void removElements(Product p) {
		setElements.remove(p);
	}
	
}		
