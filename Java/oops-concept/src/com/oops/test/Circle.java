package com.oops.test;

public class Circle {
   
	private double radius=1.0;
	private String color="red";
	
	
	public Circle()
	{
		
	}
	
	
	public Circle(double r)
	{
		this.radius=r;
	}
	
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public double getArea()
	{
		return Math.PI * this.radius * this.radius;
	}
	
}
