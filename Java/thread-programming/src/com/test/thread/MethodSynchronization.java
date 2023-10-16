package com.test.thread;

class Multiplication 
{
	
	static synchronized public void print(int n)
	{
		for(int i=1;i<=10;i++)
		{
			
			
				System.out.println(n + " x "+ i +" = "+n*i);
			
		}
	}
}


class TableThread extends Thread
{
	Multiplication multiplication;
	int n;
	public TableThread(Multiplication multiplication,int n)
	{
		this.n=n;
		this.multiplication=multiplication;
		
	}
	
	public void run()
	{
		this.multiplication.print(this.n);
	}
}


public class MethodSynchronization {

	public static void main(String[] args) {
		
		Multiplication multiplication=new Multiplication();
		
		TableThread table1=new TableThread(multiplication,7);
		TableThread table2=new TableThread(multiplication,10);
		
		table1.start();
		table2.start();
		
	}

}
