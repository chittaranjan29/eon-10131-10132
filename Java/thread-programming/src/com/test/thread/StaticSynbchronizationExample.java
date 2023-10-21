package com.test.thread;

class Display
{
	public static synchronized void greeting(String name)
	{
		for(int i=0;i<3;i++)
		{
			System.out.println("Good Morning: ");
			System.out.println(name);
			
			try
			{
				Thread.sleep(2000); //2 seconds
			}
			catch (InterruptedException e) {
				
				System.out.println(e);
			}
		}
	}
}


class My_Thread extends Thread
{
	Display display;
	String name;
	
	My_Thread(Display display, String name )
	{
		this.display=display;
		this.name=name;
	}
	
	public void run()
	{
		display.greeting(name);
	}
	
}



public class StaticSynbchronizationExample {

	public static void main(String[] args) {
		
		Display display1=new Display();
		Display display2=new Display();
		
		My_Thread t1=new My_Thread(display1, "Aman");
		My_Thread t2=new My_Thread(display2, "Shilini");
		
		
		t1.start();
		t2.start();
	}

}
