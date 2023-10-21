package com.test.thread;
class Sample implements Runnable
{

	@Override
	public void run() {
		
		try
		{
			Thread.sleep(1500);
		}
		catch (InterruptedException e) 
		{
			
			e.printStackTrace();
		}
		
		
		System.out.println("State of t1 while it called join method on t2"+Test.sample.getState());
		
		
	}
	
}

public class Test implements Runnable
{

	public static Thread sample;
	public static Test test;
	
	
	@Override
	public void run() {
		
		Sample sample=new Sample();
		Thread t1=new Thread(sample);
		
		System.out.println("State of t1 after creating it: "+t1.getState());
		
		t1.start();
		
		System.out.println("State of t1 after calling start method: "+t1.getState());
		
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		System.out.println("State of t1 after calling sleep method: "+t1.getState());
		
		
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("State of t1 after completing the execution: "+t1.getState());

		
	}
	
	
	public static void main(String args[])
	{
		test=new Test();
		sample=new Thread(test);
		
		System.out.println("State of the sample after creating it:"+sample.getState());
		
		sample.start();
		
		System.out.println("State of the sample after running it:"+sample.getState());

		
		
	}
	
}

