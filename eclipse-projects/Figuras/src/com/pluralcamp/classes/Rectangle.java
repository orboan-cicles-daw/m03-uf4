package com.pluralcamp.classes;

public class Rectangle  extends Shape {

	private double base;
	private double height; // altura
	
	public Rectangle() {}
	
	public Rectangle(double base) {
		this.setBase(base);
	}
	
	public Rectangle(double base, double height) {
		//INICIALIZACIÓN DEL ESTADO	
		this.setBase(base);
		this.setHeight(height);
		System.out.printf("Rectangulo construido con"
				+ " base %f y altura %f %n",
				this.getBase(), this.getHeight());
	}

	// setter --> set seguido del nombre del
	// atributo primera letra en mayúscula
	public void setBase(double value) {
		if (value < 0) {
			System.out.println("Valor invalido");
		} else {
			base = value;
		}
	}
	
	public double getBase() {
		return this.base;
	}

	public void setHeight(double height) {
		if (height < 0) {
			System.out.println("Valor invalido");
		} else {
			this.height = height;
		}
	}
	
	public double getHeight() {
		return this.height;
	}

	//Behavior
	@Override
	public double getArea() {
//		super.getArea();
		return base * height;
	}
	
	public double getPerimeter() {
		return (2 * this.base) + (2 * this.height);
	}
	
}

