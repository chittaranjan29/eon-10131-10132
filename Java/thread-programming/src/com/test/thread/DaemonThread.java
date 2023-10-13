package com.test.thread;

class A extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(Thread.currentThread().getName()+":"+"It's a Daemon thread.");
		}
		else
		{
			System.out.println(Thread.currentThread().getName()+":"+"It's a User thread.");
		}
	}
}


public class DaemonThread {

	public static void main(String[] args) {
		
		A t1=new A();
		A t2=new A();
		
		t2.setDaemon(true);
		
		t1.start();
		t2.start();
		
	}

}
