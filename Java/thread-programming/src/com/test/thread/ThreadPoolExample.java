package com.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class UserTask extends Thread
{
	String name;
	
	public UserTask(String name)
	{
		this.name=name;
	}
	
	
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
			
			System.out.println("task Name "+this.name+" executed by "+Thread.currentThread().getName()+":"+i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
	}
	
	
}



public class ThreadPoolExample {

	public static void main(String[] args) {
		
		UserTask t1=new UserTask("task1");
		UserTask t2=new UserTask("task2");
		UserTask t3=new UserTask("task3");
		UserTask t4=new UserTask("task4");
		UserTask t5=new UserTask("task5");
		
		
		ExecutorService threadPool=Executors.newCachedThreadPool();
		
		threadPool.execute(t1);
		threadPool.execute(t2);
		threadPool.execute(t3);
		threadPool.execute(t4);
		threadPool.execute(t5);
		
		threadPool.shutdown();
	}

}
