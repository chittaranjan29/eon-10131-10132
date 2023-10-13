package com.test.thread;

class SampleThread implements Runnable
{
	@Override
	public void run() {
		
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
	}
	
}
public class ThreadExample2 {

	public static void main(String[] args) {
		
		SampleThread t1=new SampleThread();				
		Thread t=new Thread(t1);		
		t.start();

	}

}
