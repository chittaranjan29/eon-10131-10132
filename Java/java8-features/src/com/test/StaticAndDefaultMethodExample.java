package com.test;

interface Drawable1
{
	abstract public void draw();
	
	public static void testStatic()
	{
		System.out.println("This is a static method");
	}
	
	public default void testDefault()
	{
		System.out.println("This is a default method");
	}
}

class DrawableImpl implements Drawable1
{
 
	@Override
	public void draw() {
		
		System.out.println("This is the draw method");
	}
	
}
public class StaticAndDefaultMethodExample {

	public static void main(String[] args) {
		
		Drawable1 drawable=new DrawableImpl();
		drawable.draw();
		drawable.testDefault();
		Drawable1.testStatic();

	}

}
