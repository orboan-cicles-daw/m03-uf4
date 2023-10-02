package com.pluralcamp.classes;

public class Persona extends SerVivo {
	private String nombre;

	public Persona() {
		super(); //Llama al constructor de SerVivo
		System.out.println("Desde el constructor de Persona, sin parámetros");
	}	
	
	public Persona(String name) {
		this(); //Llama al constructor de SerVivo
		this.nombre = name;
		System.out.println("Desde el constructor de Persona, con el parámetro nombre");
	}	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
