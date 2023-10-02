package com.pluralcamp.classes;

public class Pair<K,V> { //wrapper (emboltorio)
	
	//SOLUCIÓN: usando TIPOS DE DATOS GENERICOS
	
	private K key;
	private V value;	
		
	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
	

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}

	@Override
	public String toString() {
		//return "Key = " + this.key + ", value = " + this.value; 
		return this.value.toString() + " tiene DNI " + this.key.toString();
	}
}
