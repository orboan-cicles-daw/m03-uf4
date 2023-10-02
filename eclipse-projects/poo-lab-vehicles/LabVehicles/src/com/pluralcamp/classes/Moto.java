package com.pluralcamp.classes;

public class Moto extends Vehicle implements Polluter{
	@Override
	public void expulsaCO2() {		
		System.out.println(this.getClass().getSimpleName() + " Contamino con " +
					"1200 Kg de CO2 al año");
	}
}
