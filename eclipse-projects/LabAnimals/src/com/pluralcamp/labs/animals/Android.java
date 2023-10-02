package com.pluralcamp.labs.animals;

public class Android implements Speakable{

	@Override
	public void makeSound() {
		System.out.println("Beep beep beep");		
	}
	
	@Override
	public void organ() {
		System.out.println("Parlo per l'altaveu");
	}

	
}
