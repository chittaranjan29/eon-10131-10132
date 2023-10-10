package com.oops.test;

abstract class Vehicle
{
	int speed=0;
	static String fuelType;
	
	Vehicle()
	{
		System.out.println("This is default constructor");
	}
	
  abstract void moveForward();
  abstract void moveBackward();
  abstract void turnLeft();
  abstract void turnRight();
  
  public void stop()
  {
	  System.out.println("Vehicle is stopping");
  }
  
  static void test()
  {
	  System.out.println("This is a static method..");
  }
  
}


class CarImplementation extends Vehicle
{

	@Override
	void moveForward() {
		
		System.out.println("car is moving in forward direction");
		
	}

	@Override
	void moveBackward() {
		
		System.out.println("car is moving in backward direction");
		
	}

	@Override
	void turnLeft() {
		System.out.println("car is turning left");
		
	}

	@Override
	void turnRight() {
		System.out.println("car is turning right");
		
	}
	
}

class BikeImplementation extends Vehicle
{

	@Override
	void moveForward() {
		System.out.println("Bike moving forward");
		
	}

	@Override
	void moveBackward() {
		System.out.println("Bike moving backward");
		
	}

	@Override
	void turnLeft() {
		System.out.println("Bike turning left");
		
	}

	@Override
	void turnRight() {
		System.out.println("Bike turning right");
		
	}
	
}

public class AbstractClassExample {

	public static void main(String[] args) {
		
		CarImplementation car=new CarImplementation();
		
		car.moveBackward();
		car.moveForward();
		car.turnLeft();
		car.turnRight();
		car.stop();
		car.test();
		Vehicle.test();
		//Vehicle vehicle=new Vehicle();
		
		
		BikeImplementation bike=new BikeImplementation();
		bike.moveBackward();
		bike.moveForward();
		bike.turnLeft();
		bike.turnRight();

	}

}
