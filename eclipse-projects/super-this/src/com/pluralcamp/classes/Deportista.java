package com.pluralcamp.classes;

public class Deportista extends Persona {

	private String deporte;
	
	public Deportista() {
		super(); //Llama al constructor de Persona
		System.out.println("Desde el constructor de Deportista");
	}

	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}		
}
