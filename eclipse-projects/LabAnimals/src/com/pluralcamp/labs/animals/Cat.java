package com.pluralcamp.labs.animals;

public class Cat extends Animal implements Speakable {
	
	//ESTADO
	String size; //big, medium, small
	
	//COMPORTAMIENTO (BEHAVIOR)
	void salta() {
		System.out.println("El gato de color salta");
	}
	
	void lick() {
		System.out.println("El gato se lame");		
	}	
	
	@Override
	public void makeSound() {
		System.out.println("El gato hace miauuu");
	}
	
	public void come() {
		System.out.print("Soy un gato: ");
		super.come();
	}
	
}
