package com.pluralcamp.classes;

public class App {

	public static void main(String[] args) {
		
		System.out.println("--- Objeto de JugadorBasket: ----");
		JugadorBasket player = new JugadorBasket();
		System.out.println("--- Objeto de Deportista: ----");
		Deportista deportista = new Deportista();
		System.out.println("--- Objeto de Persona: ----");
		Persona persona = new Persona();
		System.out.println("--- Objeto de Persona2: ----");
		Persona persona2 = new Persona("Laura");
		System.out.println("--- Objeto de SerVivo: ----");
		SerVivo serVivo = new SerVivo();
		System.out.println("--- Objeto de Object: ----");
		Object object = new Object();
		
		System.out.printf("%n--- Casting con polimorfismo:  ----");		
		Persona person = new Deportista();//objeto Deportista
		Deportista sportsman = (Deportista)person;//Casting
		sportsman.setDeporte("Basket");
		person.setNombre("Michael");
		System.out.println(((Deportista)person).getDeporte());
		System.out.println(sportsman.getNombre());				
	}

}
