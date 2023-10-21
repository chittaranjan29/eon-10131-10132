package com.test;
class Demo
{
	final public void test() //final at method level: prevents from overriding a method
	{
		System.out.println("This is a test method");
	}
}

final class Sample extends Demo//final at class level:prevents from extending a class
{
	//public void test()
	//{
	//	System.out.println("This is a test method");
	//}
}

//class Sample extends Demo   //compile time error
//{
	
//}
public class FinalkeywordExample {

	public static void main(String[] args) {
		//final at variable level:prevents from reinitializing a variable
		final double rateOfInetrest=10.7; //constant
		//rateOfInetrest=9.3;  compiler error
		
	}

}
