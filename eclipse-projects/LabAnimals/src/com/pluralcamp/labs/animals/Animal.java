package com.pluralcamp.labs.animals;

public class Animal {
	
	private String tipo; 
	private String color; 
	private boolean isDomesticated;
	private double weight;
	
	public void duerme() {
		System.out.print("El animal duerme...");
	}
	
	public void come() {
		System.out.print("El animal come...");
	}
	
	public void reproduce() {
		System.out.print("El animal se reproduce...");
	}
}
