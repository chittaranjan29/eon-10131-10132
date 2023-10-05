package com.oops.test;

class A1   //parent, base, super class
{
	public int a=10;
	public void testA1()
	{
		System.out.println("This is testA method");
	}
}


class B1 extends A1 //child, sub, derived class
{
	public int b=20;
	public void testB1()
	{
		System.out.println("This is testB method");
	}
}

public class InheritanceExample {

	public static void main(String[] args) {
		
		B1 ob=new B1();
		ob.testA1();
		ob.testB1();
		System.out.println(ob.a);
		System.out.println(ob.b);
		

	}

}
