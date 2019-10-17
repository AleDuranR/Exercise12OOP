package com.exercise.model;

public class Square extends Shape {
	private double side;
	
	public Square(){
	}
	
	public Square(double side) {
		this.side = side;
	}
	
	public double CalculateArea(double side) {
		return side * side;
	}
	
	public double CalculatePerimeter(double side) {
		return side*4;
	}
	// Getters and setters
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
}
