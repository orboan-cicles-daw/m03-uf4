package com.pluralcamp.classes;

public class Vehicle {
	private String color;
	private Gas gas;
	private int numberOfWheels;
	
	
	//getters / setters
	
	
	
	//Comportamiento
	public void acelera() {
		System.out.println(this.getClass().getSimpleName() + " acelerando...");
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Gas getGas() {
		return gas;
	}

	public void setGas(Gas gas) {
		this.gas = gas;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public void frena() {
		System.out.println(this.getClass().getSimpleName() + " frenando...");
	}
	
	public boolean isOn(boolean encender) {
		System.out.println("Està encendido? " + encender);
		if(encender) return true;
		return false;
	}
}
