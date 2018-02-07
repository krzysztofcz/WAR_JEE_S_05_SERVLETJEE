package pl.coderslab;

public class Product {

	private String name;
	private double quantity;
	private double price;
	
	
	
	
	
	public Product(String name, double quantity, double price) {
		
		super();
		setName(name);
		setQuantity(quantity);
		setPrice(price);
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
