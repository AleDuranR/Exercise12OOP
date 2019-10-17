package com.exercise.model;

public abstract class Shape implements Shapeable{
	@Override
	public String Draw() {
		return "Figure is being erased";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String ChangeColor() {
		return "Figure is being change color";
		// TODO Auto-generated method stub
		
	}

	@Override
	public String Erase() {
		// TODO Auto-generated method stub
		return "Figure is being erased";
	}

	@Override
	public String CalculateArea() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String CalculatePerimeter() {
		// TODO Auto-generated method stub
		return 0;
	
	}

}
