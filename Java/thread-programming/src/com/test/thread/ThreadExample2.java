package com.test.thread;

class FactorialThread implements Runnable
{
	int n;
	FactorialThread(int num)
	{
		this.n=num;
	}
	
	@Override
	public void run() {
		
		//5!= 1 x 2 x 3 x 4 x 5=120
		int fact=1,i;
		
		for(i=1;i<=this.n;i++)
		{
			fact=fact*i;
		}
		
		System.out.println("Factorial:"+fact);
		
	}
	
}
public class ThreadExample2 {

	public static void main(String[] args) {
		
		FactorialThread factorialThread=new FactorialThread(5);
		Thread thread=new Thread(factorialThread);
		thread.run();
			
		FactorialThread factorialThread1=new FactorialThread(10);
		Thread thread1=new Thread(factorialThread1);
		thread1.run();
			
	}

}
