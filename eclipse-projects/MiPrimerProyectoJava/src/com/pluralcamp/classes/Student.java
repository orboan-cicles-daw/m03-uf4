package com.pluralcamp.classes;

//nombre cualificado de la clase Student:
//com.pluralcamp.classes.Student

public class Student {
	
	//ATRIBUTOS (variables)
	String nombre;
	int edad;
	String dni;
    double[] notas;
	
	//METODOS (funciones)
	void matricula() {
		System.out.println("El estudiante " + nombre + " se matricula");
	}
	
	void asisteAClase() {
		System.out.println("El estudiante " + nombre + " asiste a clase");
	}
	
	void preguntaDudas() {
		System.out.println("El estudiante " + nombre + " pregunta dudas");
	}
	
}

