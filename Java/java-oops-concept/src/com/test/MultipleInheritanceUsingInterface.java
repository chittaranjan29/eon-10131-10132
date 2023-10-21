package com.test;

interface Callable
{
	void call();
	void run();
}

interface Runnable
{
	void run();
}

class AbleImpl implements Callable, Runnable
{

	@Override
	public void run() {
		
		System.out.println("I can run");
		
	}

	@Override
	public void call() {
		System.out.println("I can call");
		
	}
	
}


public class MultipleInheritanceUsingInterface {

	public static void main(String[] args) {
		//AbleImpl ableImpl=new AbleImpl();
		//ableImpl.call();
		//ableImpl.run();
		
		Callable callable=new AbleImpl();
		callable.run();
		
		Runnable runnable=new AbleImpl();
		runnable.run();
		
	}

}
