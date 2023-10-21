package com.test.thread;


class B extends Thread
{
	public B(String threadName,ThreadGroup group)
	{
		super(group,threadName);
		
	}
	
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try
			{
				Thread.sleep(100);
			} 
			catch (InterruptedException e) 
			{
				
				e.printStackTrace();
			}
		}
	}
}
public class ThreadGroupDestroyExample {

	public static void main(String[] args) throws InterruptedException {
		
		
		ThreadGroup parentGroup=new ThreadGroup("parent-group");
		ThreadGroup childGroup=new ThreadGroup(parentGroup, "child-group");
		
		
		A t1=new A("t1",parentGroup);
		t1.start();
		
		A t2=new A("t2",parentGroup);
		t2.start();
		
		t1.join();
		t2.join();
		
		
			childGroup.destroy();
			parentGroup.destroy();
		
	}

}
