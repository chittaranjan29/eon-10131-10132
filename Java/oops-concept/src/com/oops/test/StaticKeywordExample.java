package com.oops.test;

public class StaticKeywordExample {
	
	static String st="Hello World!";
	String st1="Hi there!!";
	
	//A static block gets executed before the main method at the time class loading. 
	static
	{
		st="Hello";
		//System.out.println(st1); compile time error
		test();//from static block static method can be called
		System.out.println("This is a static block");
	}


	
	
	//Static method belongs to the class rather than object
	public static void test()
	{
		st="HELLO WORLD";
		System.out.println(st);
		//System.out.println(st1); compile time error
	}
	
	
	public void demo()
	{
		//A non static method can access both static and non-static data members
		System.out.println(st);
		System.out.println(st1);
	}
	
	public static void main(String[] args) {
		
		//A static method can be accessed by the Class name.
		StaticKeywordExample.test();
		
		
		StaticKeywordExample staticKeywordExample=new StaticKeywordExample();
		staticKeywordExample.demo();
	}

}
