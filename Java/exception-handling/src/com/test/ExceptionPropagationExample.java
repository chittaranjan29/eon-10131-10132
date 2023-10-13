package com.test;

public class ExceptionPropagationExample {

	public void method1()
	{
		System.out.println("Method1 is invoked");
		System.out.println(5/0);
	}
	
	public void method2()
	{
		System.out.println("Method2 is invoked");
		method1();
	}
	
	public void method3()
	{
		System.out.println("Method3 is invoked");
		method2();
	}
	
	
	
	public static void main(String[] args) {
		
		ExceptionPropagationExample ob=new ExceptionPropagationExample();
		
		 ob.method3();
		
	}

}
