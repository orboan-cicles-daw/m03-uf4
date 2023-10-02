package com.pluralcamp.classes;

public interface ICart {
    public boolean addProduct(Product product);
    public boolean addProduct(Product product, int amount);
    public void printCart();
}
