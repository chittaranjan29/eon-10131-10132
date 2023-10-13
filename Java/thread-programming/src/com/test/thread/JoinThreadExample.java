package com.test.thread;


class SampleThread1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+ i);
		}
	}
}
class SampleThread2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+ i);
		}
	}
}
public class JoinThreadExample {

	public static void main(String[] args) {
		
		SampleThread1 thread1=new SampleThread1();
		SampleThread2 thread2=new SampleThread2();
		
		thread1.start();
		
		try 
		{
			thread1.join(2000);
		}
		catch (InterruptedException e)
		{
			
			e.printStackTrace();
		}
		
		
		thread2.start();
		
	}

}
