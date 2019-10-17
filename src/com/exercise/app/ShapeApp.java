package com.exercise.app;

import java.lang.Math;
import java.util.Scanner;
import com.exercise.model.Shape;
import com.exercise.model.Square;
import com.exercise.model.Circle;
import com.exercise.model.Triangle;

public class ShapeApp {

	public static void main(String[] args) {
		double radio = 0;
		// Instansear un objeto
		Square square1 = new Square();
		Circle circle1 = new Circle();
		Triangle triangle1 = new Triangle();
		
		// Hacer un objeto que todavia no esta definido 
		// Para posteriormente instanciarlo a una clase espeficia
		// Que figure quieres?
		Shape miForma;
		// Quiero un triangulo.
		miForma = new Triangle();
		
		
		// instansear un objeto parametrizado
		Square square2 = new Square(10.2);
		Circle circle2 = new Circle(5.3);
		Triangle triangle2 = new Triangle(5.4,6.8);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input the radio of the circle: ");
		radio = scan.nextDouble();
		
		circle1.setRadio(radio);
		 System.out.println("The area of th circle is: "+ circle1.CalulateArea(circle1.getRadio()));
		
	}

}
