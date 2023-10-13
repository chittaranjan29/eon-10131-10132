package com.test.thread;

class TestA extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+ i);
		}
	}
}

class TestB extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+ i);
		}
	}
}

class TestC extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName()+":"+ i);
		}
	}
}
public class ThreadPriority {

	public static void main(String[] args) {
		TestA t1=new TestA();
		TestB t2=new TestB();
		TestC t3=new TestC();
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		t3.setName("Thread3");
		
		//t1.setPriority(1);
		//t2.setPriority(5);
		//t3.setPriority(10);
		
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		System.out.println(t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();

	}

}
