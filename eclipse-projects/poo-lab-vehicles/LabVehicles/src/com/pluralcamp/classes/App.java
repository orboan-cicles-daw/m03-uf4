package com.pluralcamp.classes;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car coche = new Car();
//		coche.acelera();
		
		Bus autobus = new Bus();
//		autobus.frena();
		
		Moto motocicleta = new Moto();
//		motocicleta.isOn(false);
		
		Train tren = new Train();
//		tren.frena();
		
		Vehicle[] vehiculos = new Vehicle[] {coche,autobus,motocicleta,tren};
		
		for(Vehicle v : vehiculos) {
			if(v instanceof Bus)
				v.acelera();
			else if(v instanceof Train)
				v.frena();
			else 
				v.isOn(true);
		}
		
		//vehiculos[2].acelera();
		
		Polluter[] contaminantes = new Polluter[] {coche,autobus,motocicleta};
		
		for(Polluter contaminante : contaminantes) {
			contaminante.expulsaCO2();
			contaminante.carburant();
		}

	}

}
