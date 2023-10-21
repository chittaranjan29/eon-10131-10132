package com.test;

public class StaticBlockExample {

	int a=50;
	static int  b=8;
	static
	{
		
		System.out.println("This is a static block");
		//System.out.println(a); //compiler error
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		System.out.println("This is the main mathod");

	}

}
