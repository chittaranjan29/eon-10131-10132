package com.test.thread;
class Demo extends Thread
{
	public void run()
	{
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
	}
}
public class ThreadInformation {

	public static void main(String[] args) {
		Demo t1=new Demo();
		t1.setName("My-thread");
		t1.setPriority(10);
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.start();
		
		System.out.println(t1.getId());

	}

}
