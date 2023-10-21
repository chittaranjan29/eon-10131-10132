package com.test.thread;

class DaemonThread extends Thread
{
	public DaemonThread(String msg)
	{
		super(msg);
	}
	
	
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(getName()+" is Daemon thread");
		}
		else
		{
			System.out.println(getName()+" is user thread");
		}
	}
}


public class DaemonThreadExample {

	public static void main(String[] args) {
		DaemonThread d1=new DaemonThread("t1");
		DaemonThread d2=new DaemonThread("t2");
		DaemonThread d3=new DaemonThread("t3");
		
		d1.setDaemon(true);
		
		d1.start();
		d2.start();
		d3.start();

	}

}
