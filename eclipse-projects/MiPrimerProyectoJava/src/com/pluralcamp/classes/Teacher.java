package com.pluralcamp.classes;

public class Teacher {
	
	String name;
	String id;
	String especialidad;

	void imparteAsignatura() {
		System.out.printf("El profesor %s imparte la asignatura %n", name);
	}
	
	void preparaRecursos() {
		System.out.printf("El profesor %s prepara recursos %n", name);
	}
}
