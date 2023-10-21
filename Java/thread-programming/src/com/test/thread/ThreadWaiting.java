package com.test.thread;
class MyThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try 
			{
				Thread.sleep(2000,500); //total sleep duration 2000mills + 500nanos
			} 
			catch (InterruptedException e) {

				System.out.println("Exception Handled");
			}
		}
	}
}


public class ThreadWaiting {

	public static void main(String[] args) {
		MyThread t1=new MyThread();
		MyThread t2=new MyThread();
		
		t1.start();
		t2.start();

	}

}
