package com.pluralcamp.classes;

public class Bus extends Vehicle implements Polluter{
	@Override
	public void expulsaCO2() {		
		System.out.println(this.getClass().getSimpleName() + " Contamino con " +
					"10 Toneladas de CO2 al año");
	}
}
