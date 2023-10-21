package com.test;
interface A1
{
	void method1();
	void method2();
	
	private static void test()
	{
		System.out.println("This is test method");
	}
	
	public static void teststatic()
	{
		 test();
	}
}


interface B1 extends A1
{
	void method3();

}

class Impl implements B1
{

	@Override
	public void method1() {
		
		System.out.println("Method 1");
		
	}

	@Override
	public void method2() {
		System.out.println("Method 2");
		
	}

	@Override
	public void method3() {
		System.out.println("Method 3");
		
	}
	
}

public class ExtendInterfaceExample {

	public static void main(String[] args) {
		Impl impl=new Impl();
		impl.method1();
		impl.method2();
		impl.method3();
		
		
	}

}
