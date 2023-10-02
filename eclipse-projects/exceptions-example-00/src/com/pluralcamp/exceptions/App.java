package com.pluralcamp.exceptions;

public class App {
	public static void main(String[] args) {
		
		ListOfNumbers listaDeNums =
				new ListOfNumbers();
		
		try {
			listaDeNums.writeList();
		} catch (MaintenanceException e) {
			System.err.println(e.getMessage());
		}		
		System.out.println("Programa finalizado");
	}
}
