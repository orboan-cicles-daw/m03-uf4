package com.pluralcamp.labs.animals;

public class Cow extends Animal implements Speakable {
	
	//ESTADO
	boolean lactant; //si da leche o no
	
	//COMPORTAMIENTO	
	void daLeche() {
		System.out.println("La vaca da leche");
	}
	
	@Override
	public void makeSound() {
		System.out.println("La vaca hace muuuu");
	}
	
	public void come() {
		System.out.print("Soy una vaca: ");
		super.come();
	}
	
}
