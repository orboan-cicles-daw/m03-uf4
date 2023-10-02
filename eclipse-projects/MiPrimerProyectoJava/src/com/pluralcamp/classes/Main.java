package com.pluralcamp.classes;

/*
 * Clase principal: 
 * CONTIENE EL PUNTO DE ENTRADA A LA APLICACIÓN.
 * Puede llamarse como se quiera.
 * Aunque por convenio se suele llamar:
 * - Main
 * - App
 * - Application
 * - Driver
 */
public class Main {
    /*
     * Este método es el método principal
     * que TODA aplicación Java DEBE tener.
     * Es un método OBLIGATORIO.
     * DEBER SER:
     * - público
     * - estatico
     * - void
     * - parámetro DEBE ser un array de String
     * - su nombre DEBE ser main
     * Si se cumple TODO esto, VA A SER (SIEMPRE)
     * NUESTRO PUNTO DE ENTRADA A LA APLICACIÓN
     * (la aplicación empieza a ejecutarse AQUÍ).
     * Este método main (método principal) o 
     * punto de entrada de mi aplicación 
     * ES LLAMADO AUTOMÁTICAMENTE POR LA JVM
     */
	public static void main(String[] args) {
		//System.out.println("Hola Java");
		
		double[] notas1 = {7.6, 5.5, 9.7, 4.1, 6.6, 5.1, 3.8, 8.6, 9.9, 5.0};//Aula 1

		double[] notas2 = {5.0, 4.5, 6.2, 4.9, 7.2, 8.4, 6.5, 3.8, 9.1, 5.7};//Aula 2

		double[] notas3 = {4.5, 6.8, 6.3, 7.9, 7.1, 3.7, 6.0, 9.0, 8.9, 7.3};//Aula 3
		
		//Notas.printMaxMin(notas1, 1);
		//Notas.printMaxMin(notas2, 2);
		//Notas.printMaxMin(notas3, 3);
		
		//------------------------------------
		
		Student estudiante1 = new Student();
		estudiante1.nombre = "Laura";
		estudiante1.edad = 24;
		estudiante1.dni = "12345678K";
		
		estudiante1.matricula();
		estudiante1.asisteAClase();
		estudiante1.preguntaDudas();
		
		Student estudiante2 = new Student();
		estudiante2.nombre = "Franky";
		estudiante2.edad = 28;
		estudiante2.dni = "444333777J";
		
		estudiante2.matricula();
		estudiante2.asisteAClase();
		estudiante2.preguntaDudas();		
		
		//--------------------------------------
		
		Teacher profe1 = new Teacher();
		profe1.name = "Oriol";
		profe1.especialidad = "Java Backend";
		
		profe1.imparteAsignatura();
		profe1.preparaRecursos();								
		
	}	
	
}
