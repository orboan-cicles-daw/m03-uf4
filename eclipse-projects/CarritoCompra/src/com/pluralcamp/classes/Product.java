package com.pluralcamp.classes;

public class Product {
	
	private final Category category;
	private final String id;
	private String name;
	private float price;

	public Product(Category category, String id) {
		this.category = category;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Category getCategory() {
		return category;
	}

	public String getId() {
		return id;
	}

		
	@SuppressWarnings("removal") 
	@Override 
	public String toString() {
		String separator = "|";
		return this.id + separator + this.name + separator + 
				(new Float(this.price)).toString();// Deprecated
	}

}
