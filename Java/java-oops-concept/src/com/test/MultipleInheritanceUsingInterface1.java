package com.test;

interface Verify
{
	void test();
}

interface Call
{
	void call();
	
}

interface Do extends Verify,Call
{
	void work();

}

class Activity implements Do
{

	@Override
	public void test() {
		
		System.out.println("I can test");
		
	}

	@Override
	public void call() {
		System.out.println("I can call");
		
	}

	@Override
	public void work() {
		System.out.println("I can work");
		
	}
	
}








public class MultipleInheritanceUsingInterface1 {

	public static void main(String[] args) {
		
		Activity activity=new Activity();
		activity.call();
		activity.work();
		activity.test();

	}

}
