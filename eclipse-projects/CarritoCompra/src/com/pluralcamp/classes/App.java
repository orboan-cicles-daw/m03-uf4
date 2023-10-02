package com.pluralcamp.classes;

public class App {
	public static void main(String[] args) {
		
		//Ejercicio de Collections y Generics
		
		Product libroJava = new Product(Category.BOOKS, "890K");
		libroJava.setName("Java para todos");
		libroJava.setPrice(4.5f);
		
		Product portatil = new Product(Category.COMPUTERS, "123");
		portatil.setName("Vant Agile 15");
		portatil.setPrice(1235.0f);
		
		Product banana = new Product(Category.FOOD, "P65");
		banana.setName("banana");
		banana.setPrice(0.18f);
		
		Cart miCarrito = new Cart();
		
		miCarrito.addProduct(libroJava,8);
		miCarrito.addProduct(portatil);
		miCarrito.addProduct(banana,20);
		
		miCarrito.printCart();
	}
}
