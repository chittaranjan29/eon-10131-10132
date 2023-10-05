package com.oops.test;

public class Car {
	
	//data members or instance variables represents the states of the entity
	public String carNumber;
	public String carBrand;
	public String carModel;
	public String carColor;
	public String carFuelType;
	public int speed;
	
	//default constructor
	public Car()
	{
		System.out.println("default constructor invoked");
	}
	
	//Parameterized Constructor
	public Car(String carNumber, String carBrand, String carModel, String carColor,String carFuelType,int speed  )
	{
		this.carBrand=carBrand;
		this.carColor=carColor;
		this.carNumber=carNumber;
		this.carFuelType=carFuelType;
		this.carModel=carModel;
		this.speed=speed;
	}
	
	
	public Car(Car car)
	{
		this.carBrand=car.carBrand;
		this.carColor=car.carColor;
		this.carModel=car.carModel;
	}
	
	
	//methods represents behavior of the entity
	public void start()
	{
		this.speed=1;
		System.out.println("Car started");
	}
		
	public void speedUp(int speed)
	{
		this.speed=this.speed + speed;
	}
	
	public void slowDown(int speed)
	{
		this.speed=this.speed - speed;
	}
	
	public void stop()
	{
		this.speed=0;
		System.out.println("Car stopped");
	}
	
	public void dispaly()
	{
		System.out.println(carNumber);
		System.out.println(carBrand);
		System.out.println(carModel);
		System.out.println(speed);
		System.out.println(carColor);
		System.out.println(carFuelType);
	}
	
		
}
