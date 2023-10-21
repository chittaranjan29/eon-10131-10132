package com.test;

//Abstract class
 abstract class Car
{
	public abstract void stop();
}

 
 //Concrete class 
 class Honda extends Car
{

	//Hiding implementation details 
	@Override
	public void stop() {
		
		System.out.println("machanism to stop the car using break");
	}
	
}



public class AbstractClassExample {

	public static void main(String[] args) {
		Car car=new Honda();
		car.stop();
		
	}

}
