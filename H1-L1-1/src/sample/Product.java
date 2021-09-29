package sample;

public class Product {
	private String description;
	private double weight;
	private int price;
	
	public Product (String description, double weight, int price) {
		super();
		this.description = description;
		this.weight = weight;
		this.price = price;
	}
	
	public Product() {
		super();
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [description=" + description + ", weight=" + weight + ", price=" + price + "]";
	}
	
	
}
