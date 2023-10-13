package com.test.thread;

import java.util.Scanner;

class Demo implements Runnable
{
	Thread t;
	public Demo()
	{
		t=new Thread(this);
		System.out.println("Thread is in new state");
		t.start();
	}

	@Override
	public void run() {
		
		System.out.println("Thread is in runnable state");
		Scanner scanner=new Scanner(System.in); 
		System.out.println("Thread is entering blocked state");
		System.out.println("Enter a string:");
		String st=scanner.nextLine();
		
		for(int i=1;i<=10;i++)
		{
				try 
				{
					System.out.println("Thread suspended");
					t.sleep(1000);
					System.out.println("Thread is running");
				} 
				catch (InterruptedException e) 
				{
					System.out.println("Thread is interrupted");
				}
				
				System.out.println("Thread is terminated");
				t.stop();
			
		}
		
	}
	
}


public class ThreadLifeCycle {

	public static void main(String[] args) {
		
		Demo demo=new Demo();
	}

}
