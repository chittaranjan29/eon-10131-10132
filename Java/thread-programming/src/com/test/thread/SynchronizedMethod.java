package com.test.thread;

class Multiplicationtable 
{	
	 public void display(int n)
	{
		 synchronized (this) 
		 {
			for(int i=1;i<=10;i++)
			{
				System.out.println(n+" x "+i+" = "+n*i);
			}
		 }
				 
	}
}

class MultiplicationThread1 extends Thread
{
	Multiplicationtable multiplicationtable;
	
	MultiplicationThread1(Multiplicationtable m)
	{
		this.multiplicationtable=m;
	}

	
	public void run()
	{
		multiplicationtable.display(3);
	}
	
}


class MultiplicationThread2 extends Thread
{
	Multiplicationtable multiplicationtable;
	
	MultiplicationThread2(Multiplicationtable m)
	{
		this.multiplicationtable=m;
	}

	
	
	public void run()
	{
		multiplicationtable.display(5);
	}
	
}
public class SynchronizedMethod {

	public static void main(String[] args) {
		
		Multiplicationtable multiplicationtable=new Multiplicationtable();
		MultiplicationThread1 table1=new MultiplicationThread1(multiplicationtable);
		MultiplicationThread2 table2=new MultiplicationThread2(multiplicationtable);
	
		table1.start();
		table2.start();
		
	}

}
