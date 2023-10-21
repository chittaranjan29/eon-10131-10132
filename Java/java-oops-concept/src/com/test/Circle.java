package com.test;

public class Circle {

	public String color="red";
	public double radius=1.0;
	

	public Circle() {
		
	}


	public Circle(String color, double radius) {
	
		this.color = color;
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	double getArea()
	{
		return Math.PI * this.radius * this.radius; 
	}
	
	
	public static void main(String[] args) {
		
		Circle circle=new Circle("green",7.9);
		System.out.println(circle.getRadius());
		System.out.println(circle.getArea());

	}

}
