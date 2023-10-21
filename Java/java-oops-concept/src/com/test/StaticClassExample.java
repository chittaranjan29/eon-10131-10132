package com.test;

class Outer
{
	private static String msg="Outer class static property";
	private  String message="Outer class non-static  property";
	
	public static class NestedStatic
	{
		public void printMessage()
		{
			System.out.println(msg);
		}
		public void display()
		{
			//System.out.println(message);
		}
	}
	
	
	public class Inner
	{
		
		public void display()
		{
			System.out.println(msg);
		}
	}
}


public class StaticClassExample {

	public static void main(String[] args) {
		
		//creating an instance of nested static class
		Outer.NestedStatic obj=new Outer.NestedStatic();		
		obj.printMessage();
		
		//Creating outer class object  
		Outer outer=new Outer();
		
		//creating object for non-static inner class
		Outer.Inner obj1=outer.new Inner();
		//creating object for non-static inner class
		Outer.Inner obj2=new Outer().new Inner();
		obj1.display();
		obj2.display();
		 int max = Integer.MAX_VALUE;
	}

}
