package kedi;

import java.util.LinkedList;

public class Product {
    
	private String name;
	private double price;
	public Product(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	LinkedList<Product> cart = new LinkedList<>();
	
	public  void addItem(Product product) {
		cart.add(product);
	}
	
	public void removeItem(Product product) {
		cart.remove(product);
		
	}
	@Override
	public String toString() {
	     
		return "ProductName :"+ name + "Product Price :" + price;
	}
	
	
}
