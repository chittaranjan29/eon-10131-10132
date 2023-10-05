package com.oops.test;

 class A
{
	private static String st="Hello World";
	
	public static class B
	{
		public void testB()
		{
			System.out.println(st);
			System.out.println("This is testB method");
		}
	}
}


public class StaticInnerClassExample {

	public static void main(String[] args) {
		
		
		A.B obj=new A.B();
		obj.testB();
				
	}

}
