package com.pluralcamp.classes;

import java.util.Objects;

public class Triplet<K,V,E> {

    //properties
    private K k;
    private V v;
    private E e;    
    
    public K getK() {
		return k;
	}

	public void setK(K k) {
		this.k = k;
	}

	public V getV() {
		return v;
	}

	public void setV(V v) {
		this.v = v;
	}

	public E getE() {
		return e;
	}

	public void setE(E e) {
		this.e = e;
	}

	
	@Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof Triplet)) {
            return false;
        }
        Triplet triplet = (Triplet) o;
        return Objects.equals(this.k, triplet.getK());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.k);
    }
    
    @Override
    public String toString(){
        String separator = "|";
        return k.toString() + separator + v.toString() +
            separator + e.toString();
    }
	
}
