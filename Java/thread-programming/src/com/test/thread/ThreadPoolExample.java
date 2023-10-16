package com.test.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable
{
	public String name;
	
	public Task(String s)
	{
		this.name=s;
	}

	@Override
	public void run() {
		
		for(int i=0;i<=10;i++)
		{
			System.out.println(name+":"+i);
			
			try 
			{
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) 
			{				
				e.printStackTrace();
			}
		}
	}
	
}



public class ThreadPoolExample {

	public static void main(String[] args) {
		
		//Task task1=new Task("A");	
		//Task task2=new Task("B");
		//Task task3=new Task("C");
		//Task task4=new Task("D");
		//Task task5=new Task("E");
		
		Thread task1=new Thread(new Task("A"));
		task1.setPriority(1);
		Thread task2=new Thread(new Task("B"));
		task1.setPriority(1);
		Thread task3=new Thread(new Task("C"));
		task1.setPriority(5);
		Thread task4=new Thread(new Task("D"));
		task1.setPriority(5);
		Thread task5=new Thread(new Task("E"));
		task1.setPriority(10);
		
		ExecutorService pool=Executors.newFixedThreadPool(3);
		//ExecutorService pool=Executors.newCachedThreadPool();
		
		pool.execute(task1);
		pool.execute(task2);
		pool.execute(task3);
		pool.execute(task4);
		pool.execute(task5);
		
		
		pool.shutdown();
	}

}
