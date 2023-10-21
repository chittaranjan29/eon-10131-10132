package com.test.thread;
class Print extends Thread
{
	
	public void run()
	{
		for(int i=1;i<=100;i++)
		{
			System.out.println(Thread.currentThread().getName()+" "+i);
		}
	}
}



public class JoinThreadExample {

	public static void main(String[] args) throws InterruptedException {
		
		Print t1=new Print();
		Print t2=new Print();
		Print t3=new Print();
		
		t1.start();
		
		t1.join();
		
		t2.start();
		
		t2.join();
		t3.start();
	}

}
