package com.test;

public class StaticMethodExample {

	int a=50;//non-static variable
	static int b=70;//static variable
	
	//Inside a non-static method both static and non-static data member can be accessed 
	 void demo()
	{
		System.out.println("This is a non-static method");
		System.out.println("value of a "+this.a);
		System.out.println("value of b "+StaticMethodExample.b);
	}
	
	static void test()
	{
		System.out.println("This is a static method");
		//System.out.println("value of a "+this.a);
		System.out.println("value of b "+StaticMethodExample.b);
	}
	public static void main(String[] args) {
		
		StaticMethodExample obj=new StaticMethodExample();
		
		
		StaticMethodExample.test();
		obj.demo();
	}

}
