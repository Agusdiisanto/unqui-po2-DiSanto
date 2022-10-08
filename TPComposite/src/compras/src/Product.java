package compras.src;

public class Product {
	
	protected float price;
	protected String name;
	
	public Product(float price, String name) {
		super();
		this.price = price;
		this.name = name;
	}

	public float getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
		
}	
