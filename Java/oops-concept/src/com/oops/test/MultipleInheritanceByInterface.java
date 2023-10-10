package com.oops.test;
interface C
{
  public abstract void testC();	
}


interface D
{
  public abstract void testD();	
}



class Impl implements C, D
{

	

	@Override
	public void testC() {
		System.out.println("This is testC method");
		
	}
	
	@Override
	public void testD() {
		System.out.println("This is testD method");
		
	}
	
}
public class MultipleInheritanceByInterface {

	public static void main(String[] args) {
		Impl impl=new Impl();
		impl.testC();
		impl.testD();

	}

}
