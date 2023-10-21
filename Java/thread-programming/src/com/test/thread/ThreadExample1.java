package com.test.thread;

class Mythread1 extends Thread
{
	public void run()
	{
		System.out.println("Thread1 is in execution..");
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
	}
	
	
}

class Mythread2 extends Thread
{
	public void run()
	{
		System.out.println("Thread2 is in execution..");
		for(int i=100;i>=1;i--)
		{
			System.out.println(i);
		}
	}
	
	
}

public class ThreadExample1 {

	public static void main(String[] args) {
		
		Mythread1 mythread1=new Mythread1();
		mythread1.start();
		
		Mythread2 mythread2=new Mythread2();
		mythread2.start();
	}

}
