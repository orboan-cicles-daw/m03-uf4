package com.pluralcamp.app;

import com.pluralcamp.classes.Circle;
import com.pluralcamp.classes.Color;
import com.pluralcamp.classes.Rectangle;
import com.pluralcamp.classes.Sphere;
import com.pluralcamp.classes.Square;

//java.lang

public class Main {
	
	public static void main(String[] args) {				
		
		System.out.printf("%n---- Colores -----%n");
		
		//Colores básicos
		Color white = new Color(Color.BasicColor.WHITE);
		System.out.println(Color.BasicColor.WHITE);
		System.out.println(white);
		Color black = new Color(Color.BasicColor.BLACK);
		System.out.println(black);
		Color red = new Color(Color.BasicColor.RED);
		System.out.println(red);
		Color green = new Color(Color.BasicColor.GREEN);
		System.out.println(green);
		Color blue = new Color(Color.BasicColor.BLUE);
		System.out.println(blue);
		
		//Otros colores
		Color color1 = new Color(250,160,160);
		System.out.println(color1.toString());

		Color color2 = new Color(12,14,230);
		System.out.println(color2.toString());			
		
		System.out.printf("%n---- Figuras -----%n");
		
		/*
		 * ### Ejercicio
		
		Los cuadrados se van a construir con el lado y el color directament, 
		sin setters, y ambos (lado y colores) no se van a 
		poder modificar una vez creado el objeto cuadrado:
		
		- atributos deben ser final
		- sin setters
		- crear la correspondiente sobrecarga del constructor
		- finalmente modificar el main accordingly
		 */
		
		//Cuadrado
		Square square = new Square(5.0, color1, color2);//side vale 5.0	
		//square.side = 2.0;
		//square.setSide(5.0);//setter -- escribir
		double areaCuadrado = square.getArea();
		System.out.printf(
				"Cuadrado de color %s y de lado %.2f tiene una area de %.2f %n", 
				square.getBackgroundColor().toString(),
				square.getSide(),
				areaCuadrado);
		
		//Cuadrado
		Square square2 = new Square(9.0);		
		System.out.printf(
				"Cuadrado de color %s y de lado %.2f tiene una area de %.2f %n", 
				square2.getBackgroundColor().toString(),
				square2.getSide(),
				square2.getArea());	
		
		//Rectangulo
		Rectangle rectangle = new Rectangle(2.0, 3.0);//base vale 2.0
		rectangle.setBackgroundColor(blue);
		rectangle.setColor(white);
		//rectangle.base = -2.0; //Valor INVALIDO
//		rectangle.setBase(2.0);
//		rectangle.setHeight(3.0);
		System.out.printf(
				"Rectángulo de color %s, de base %.2f y de altura %.2f tiene una area de %.2f %n", 
				rectangle.getBackgroundColor().toString(),
				rectangle.getBase(),
				rectangle.getHeight(),
				rectangle.getArea());
		
		//Circulo
		Circle circle = new Circle(5.5);//radio vale 5.0
		circle.setBackgroundColor(red);
		circle.setColor(green);
		//circle.radius = 5.5;
		//circle.setRadius(5.5);
		System.out.printf(
				"Círculo de color %s y de radio %.2f tiene una area de %.2f %n", 
				circle.getBackgroundColor().toString(),
				circle.getRadius(),
				circle.getArea());	
		
		//Esfera
		Sphere esfera = new Sphere(7.8);
		esfera.setColor(black);
		//esfera.radius = 7.8;
		//esfera.setRadius(7.8);
		System.out.printf(
				"Esfera de color %s y de radio %.2f tiene una area de %.2f y un"
				+ " volumen de %.2f %n", 
				esfera.getColor().toString(),
				esfera.getRadius(),
				esfera.getArea(),
				esfera.getVolume());	
		
		


		
		
		
				
	}
	
}
