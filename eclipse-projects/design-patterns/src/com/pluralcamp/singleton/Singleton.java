package com.pluralcamp.singleton;

public class Singleton {
	
	private static Singleton obj = null;
	private static Object mutex = new Object();
	
	private Singleton() {}
	
	//tiene que ser estático
	public static Singleton getInstance() {
		//solo 1 hilo de ejecucion va a poder entrar
		synchronized(mutex) {			
			if(obj == null) { 
				obj = new Singleton();
			}
		}
		return obj;
	}
}
