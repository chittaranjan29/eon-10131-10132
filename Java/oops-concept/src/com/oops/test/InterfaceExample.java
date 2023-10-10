package com.oops.test;

interface Drawable
{
	void getArea(); //at the compile time compiler will make this method public abstract method
	//public abstract void getArea()
	abstract void getCircumference();
	
	default void test()
	{
		System.out.println("This is a default method");
		privateTest();
	}
	
	static void staticTest()
	{
		System.out.println("this is a staic method");
		
	}
	
	private void privateTest()
	{
		System.out.println("this is a private method");
	}
}


class CircleImplementation implements Drawable
{

	@Override
	public void getArea() {
		
		System.out.println("This is getArea method");
		
	}

	@Override
	public void getCircumference() {
		
		System.out.println("This is getCircumference method");
	}
	
}


class SquareImplementation implements Drawable
{

	@Override
	public void getArea() {
		System.out.println("This is square getarea method");
		
	}

	@Override
	public void getCircumference() {
		System.out.println("This is square getCircumference method");
		
	}
	
}
public class InterfaceExample {

	public static void main(String[] args) {
	
		CircleImplementation circle=new  CircleImplementation();
		circle.getArea();
		circle.getCircumference();
		circle.test();
		
		
		SquareImplementation square=new SquareImplementation();
		square.getArea();
		square.getCircumference();
		square.test();
	}

}
