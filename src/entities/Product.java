package entities;

public class Product {
	private String name;
	private Double price;
	private int quantity;

	public Product() {
	}

	public Product(String name, Double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double totalValueStock() {
		return quantity * price;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public void showDataProduct() {
		System.out.println("Nome: " + name + "\nPrice: " + String.format("%.2f", price) + "\nQuantity: " + quantity
				+ "\nTotal value: " + totalValueStock());
	}
}
