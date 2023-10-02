package com.pluralcamp.labs.animals;

public class Duck extends Animal implements Speakable {
	
	//ESTADO
	boolean isUgly; //El patito es feo o no
	
	
	//COMPORTAMIENTO	
	void nada() {
		System.out.println("El pato nada");
	}
	
	void vuela() {
		System.out.println("El pato vuela");
	}
	
	@Override
	public void makeSound() {
		System.out.println("El pato hace quack quack");
	}
	
	public void come() {
		System.out.print("Soy un patito: ");
		super.come();
	}
	
}
