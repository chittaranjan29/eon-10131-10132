package com.test.thread;
class A extends Thread
{
	public A(String threadName,ThreadGroup group)
	{
		super(group,threadName);
		start();
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
public class ThreadGroupExample {

	public static void main(String[] args) throws InterruptedException {
		//parent group
		ThreadGroup myThreadGroup=new ThreadGroup("parent-group");
		
		 A a1=new A("a1", myThreadGroup);
		 A a2=new A("a2", myThreadGroup);
		 A a3=new A("a3", myThreadGroup);
		 
	
		 
		 System.out.println(myThreadGroup.activeCount());
		 System.out.println(myThreadGroup.activeGroupCount());
		 
		 //sub group
		 ThreadGroup childGroup=new ThreadGroup(myThreadGroup, "child-group");
		 A t1=new A("t1", childGroup);
		 A t2=new A("t2", childGroup);
		 A t3=new A("t3", childGroup);
		 
	
		 
		 System.out.println("Parent's active threads:"+myThreadGroup.activeCount());
		 System.out.println("parent's active subgroup:"+myThreadGroup.activeGroupCount());
		 
		 
		 System.out.println("Child's active threads:"+childGroup.activeCount());
		 System.out.println("Child's active subgroup:"+childGroup.activeGroupCount());
		 
		 
		
		 
		 
		 System.out.println("Child's active threads:"+childGroup.activeCount());
		 System.out.println("Child's active subgroup:"+childGroup.activeGroupCount());
		 
		 System.out.println(childGroup.isDestroyed());
		 
		 
		 

	}

}
