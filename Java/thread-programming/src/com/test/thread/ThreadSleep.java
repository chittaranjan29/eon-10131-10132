package com.test.thread;

class TestThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			try 
			{
				Thread.sleep(2000);//2000 milliseconds - 2sec
				//TestThread.sleep(2000,100);//2000 milliseconds + 100 nanoseconds
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+ i);
		}
	}
}


public class ThreadSleep {

	public static void main(String[] args) {
		
		TestThread testThread1=new TestThread();
		testThread1.start();
		
		TestThread testThread2=new TestThread();
		testThread2.start();
	}

}
