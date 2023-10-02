package com.pluralcamp.classes;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Cart implements ICart {

	// Atributos con valores por defecto
	// que representan un carrito de la compra vacío
	private Set<Triplet<Product, Integer, Float>> lines = new HashSet<>();
	private Float total = 0.0f;

	// needed getters
	public Set<Triplet<Product, Integer, Float>> getLines() {
		return lines;
	}

	public void setLines(Set<Triplet<Product, Integer, Float>> lines) {
		this.lines = lines;
	}

	public Float getTotal() {
		return total;
	}

	public void setTotal(Float total) {
		this.total = total;
	}

	// Helper methods are private
	private boolean updateLine(Triplet<Product, Integer, Float> line) {
		if (!lines.contains(line)) {
			return false;
		}
		for (Triplet<Product, Integer, Float> cline : lines) {
			if (cline.equals(line)) {
				cline.setK(line.getK());
				cline.setV(line.getV());
				cline.setE(line.getE());
			}
		}

		// Iterating over the property lines
		// When line is found, update it

		return true;
	}

	private boolean cartContains(Product product) {
		// Iterating over hash set items
		// using a foreach (enhanced for loop)
		for (Triplet<Product, Integer, Float> cline : lines) {
			if (cline.getK().equals(product)) {
				return true;
			}
		}
		return false;
	}

	private void updateTotal(Triplet<Product, Integer, Float> line) {		
		this.total += line.getE();
		// update the property total after adding the new line
		// total keeps the total price of the cart
	}

	// Public methods are interface implementations
	/*
	 * Add an amount of units of the specified product into the cart
	 * 
	 * @param product an instance of a product to be added to the cart
	 * 
	 * @param amount the number of units of the specified product to be added
	 * 
	 * @return true if the product was successfully added, false otherwise
	 */
	@Override
	public boolean addProduct(Product product, int amount) {
		// TODO
		// Create a Triplet from parameters
		Triplet<Product, Integer, Float> newLine = new Triplet<>();
		newLine.setK(product);
		newLine.setV(amount);
		float lineTotal = product.getPrice() * amount;
		newLine.setE(lineTotal);
		
		// if Cart contains the triplet, update the corresponding line
		boolean contains = this.cartContains(product);
		
		if(contains) {
			this.updateLine(newLine);
		} else {		// otherwise, add the line to the cart (to the Set)
			this.lines.add(newLine);			
		}
		this.updateTotal(newLine);
		return true; // modify accordingly
	}

	/*
	 * Add 1 single unit a the specified product into the cart
	 * 
	 * @param product an instance of a product to be added to the cart
	 * 
	 * @return true if the product was successfully added, false otherwise
	 */
	@Override
	public boolean addProduct(Product product) {
		// TODO
		return this.addProduct(product,1);
		// implementation for adding only 1 unit of the product
		//return false; // modify accordingly
	}

	@Override
	public void printCart() {
		if (lines instanceof HashSet)
			System.out.println("Lines is a HashSet");
		if (lines instanceof TreeSet)
			System.out.println("Lines is a TreeSet");
		String separator = "\\|";
		System.out.printf("%6s - %25s | %8s | %8s | %14s\n", "ID", "Name", "Price", "Amount", "Total Price (€)");
		for (Triplet<Product, Integer, Float> line : lines) {
			// Position 0 contains ID Product as String
			// Position 1 contains product name as String
			// Position 2 contains product price (per unit) as String
			// Position 3 contains Integer (amount) as String
			// Position 4 contains Float (total price) as String
			String[] lineArr = line.toString().split(separator);

			System.out.format("%6s - %25s | %8s | %8s | %14s\n", lineArr[0], lineArr[1], lineArr[2], lineArr[3],
					lineArr[4]);
		}
		DecimalFormat df = new DecimalFormat("#.##");
		df.setRoundingMode(RoundingMode.CEILING);
		System.out.format("%63s %8s€", "Total de la comanda:", df.format(this.total));
	}

}
