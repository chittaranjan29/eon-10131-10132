package com.test;

 class A {
	
	public String a="This is class A";
	
	public void testA()
	{
		System.out.println("This is testA method");
	}

}

 class B extends A
{
	 public String b="This is class B";
		
		public void testB()
		{
			System.out.println("This is testB method");
		}
}
 
class C extends B
{
	 public String c="This is class C";
		
		public void testC()
		{
			System.out.println("This is testC method");
		}
	
}

class Mutilevel
{
	public static void main(String args[])
	{
		C c=new C();
		
		c.testC();
		c.testB();
		c.testA();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(c.c);
		
		
		B b=new B();
		
		b.testB();
		b.testA();
		System.out.println(b.a);
		System.out.println(b.b);
	}
}
