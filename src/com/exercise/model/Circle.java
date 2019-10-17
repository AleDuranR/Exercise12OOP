package com.exercise.model;

public class Circle extends Shape {
	private double radio;
	
	public Circle(){
		
	}
	
	public Circle(double radio) {
		this.radio = radio;
	}
	public double CalulateArea(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}
	
	public double CalulatePermeter(double radio) {
		return 2*Math.PI*radio;
	}
	// Getters and setters
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
}
