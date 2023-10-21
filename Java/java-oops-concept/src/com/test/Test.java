package com.test;


interface Vehicle
{
	 void changeGear(int gearNumber);
	 void speedUp(int speed);
	 default int  speedDown(int speedDecreased,int currentSpeed)
	 {
		 return currentSpeed - speedDecreased;
	 }
	 
	 public static void vehicleTest()
	 {
		 System.out.println("This is static method");
	 }
	 void applyBreaks(int speed);
}

class Bike implements Vehicle
{
	
	int speed;
	int gear;
	
	

	@Override
	public void changeGear(int gearNumber) {
		
		this.gear=gearNumber;
		
	}

	@Override
	public void speedUp(int incrementSpeed) {
		
		this.speed=this.speed+incrementSpeed;
		
	}

	@Override
	public void applyBreaks(int decrementSpeed) {
		
		this.speed=this.speed-decrementSpeed;
		
	}
	
	public void bikeState()
	{
		System.out.println("Speed:"+this.speed+"\n Gear:"+this.gear);
	}
	
}


class Ecycle implements Vehicle
{
	int speed;
	int gear;

	@Override
	public void changeGear(int gearNumber) {
		
		this.gear=gearNumber;
		
	}

	@Override
	public void speedUp(int incrementSpeed) {
		
		this.speed=this.speed+incrementSpeed;
		
	}

	@Override
	public void applyBreaks(int decrementSpeed) {
		
		this.speed=this.speed-decrementSpeed;
		
	}
	
	public void bikeState()
	{
		System.out.println("Speed:"+this.speed+"\n Gear:"+this.gear);
	}
	
}


public class Test {

	public static void main(String[] args) {

		Bike bike=new Bike();
		bike.changeGear(2);
		bike.speedUp(30);
		bike.applyBreaks(10);
		bike.speedDown(5, 40);
		
		bike.bikeState();

	}

}
