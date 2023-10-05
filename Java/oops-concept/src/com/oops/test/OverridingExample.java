package com.oops.test;
class Emp
{
	public void test()
	{
		System.out.println("parent test implementation");
	}
}


class Developer extends Emp
{
	//this method overrides the parent test method
	public  void test()
	{
		System.out.println("child test implementation");
	}
}
public class OverridingExample {

	public static void main(String[] args) {
		
		//If a parent type reference refers to parent object, then parent's test method is called 
		Emp emp=new Emp();
		
		
		//If a parent type reference refers to child object, then child's test method is called
		Emp emp1=new Developer();
		
		emp.test();
		emp1.test();

	}

}
