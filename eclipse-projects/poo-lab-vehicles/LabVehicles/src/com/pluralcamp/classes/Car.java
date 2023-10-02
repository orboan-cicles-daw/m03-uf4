package com.pluralcamp.classes;

public class Car extends Vehicle implements Polluter{

	@Override
	public void expulsaCO2() {		
		System.out.println(this.getClass().getSimpleName() + " Contamino con " +
					"2 Toneladas de CO2 al año");
	}


	
}
