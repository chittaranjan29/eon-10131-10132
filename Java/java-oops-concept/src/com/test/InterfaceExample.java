package com.test;

interface Drawable
{
	abstract void draw(double side);
}

class Square implements Drawable
{

	@Override
	public void draw(double side) {
		System.out.println(side*side);
		
	}
	
}


public class InterfaceExample {

	public static void main(String[] args) {
		
		Drawable drawable=new Square();
		drawable.draw(10);
		
		

	}

}
