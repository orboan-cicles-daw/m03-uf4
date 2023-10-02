package com.pluralcamp.labs.animals;

public class Bactery extends Animal {
	
	//ESTADO
	String habitat;
	boolean isHarmful; //es peligrosa o beneficiosa
	
	//COMPORTAMIENTO	
	void infecta() {
		System.out.println("La bacteria infecta");
	}
	
	public void come() {
		System.out.print("Soy una bacteria: ");
		super.come();
	}
}
