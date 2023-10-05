package com.oops.test;


class Calculator
{
	public void addition(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void addition(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public void addition(double a,double b)
	{
		System.out.println("double arguments");
	
		System.out.println(a+b);
	}
}

public class Overloading {

	public static void main(String[] args) {
		 Calculator calculator=new Calculator();
		 
		 calculator.addition(12, 13.9);
		 calculator.addition(12, 13, 15);
		 calculator.addition(12.7, 13.6);
		 
	}
}

