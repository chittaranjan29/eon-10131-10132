package com.test;
abstract class Sunstar
{
	abstract void printInfo();
	void print()
	{
		System.out.println("This is non abstract method");
	}
	
	static void staticTest()
	{
		System.out.println("This is a static method");
	}
	
	public static final void testFinal()
	{
		System.out.println("This is a final method");
	}
	
	private void testprivate()
	{
		System.out.println("This is a private method");
	}
}

class NewEmployee extends Sunstar
{

	 String name;
	 int age;
	 float salary;
	 
	 
	public NewEmployee(String name, int age, float salary) {
		super();
		this.name = name;
		this.age = age;
		this.salary = salary;
	}


	@Override
	void printInfo() {
		
		System.out.println(this.name);
		System.out.println(this.age);
		System.out.println(this.salary);
		
	}
	
}
public class AbstractTest {

	public static void main(String[] args) {
		
	Sunstar sunstar=new NewEmployee("Raman", 23,29000);
	sunstar.printInfo();
	sunstar.print();
	sunstar.staticTest();
	Sunstar.staticTest();
	}

}
