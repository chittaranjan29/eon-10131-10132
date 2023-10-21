package com.test;
class Parent
{
	void show()//Overridden method 
	{
		System.out.println("parent's show method");
	}
}



class Child extends Parent
{
	void show()//Overriding method 
	{
		System.out.println("child's show method");
	}
}


public class overridingExample {

	public static void main(String[] args) {
		//If a parent type reference refers to a parent object, then parent's show
		//method is called
		Parent parent=new Parent();
		parent.show();
		
		//If a parent type reference refers to child object then child's show method is called.
		//This is called runtime polymorphism.
		Parent p=new Child();
		p.show();
		

	}

}
