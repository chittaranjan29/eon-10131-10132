package com.test;

class Animal
{
	public void testAnimal()
	{
		System.out.println("This is testAnimal method");
	}
}

class Dog extends Animal
{
	public void testDog()
	{
		System.out.println("This is testDog method");
	}
}

class Cat extends Animal
{
	public void testCat()
	{
		System.out.println("This is testCat method");
	}
}

public class Hierarchical {

	public static void main(String args[])
	{
		Dog dog=new Dog();
		dog.testDog();
		dog.testAnimal();
		
		
		Cat cat=new Cat();
		cat.testCat();
		cat.testAnimal();
	}
}
