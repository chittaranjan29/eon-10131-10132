package com.test;
class Car1
{
	//instance variables
	public String brand;
	public String model;
	public String number;
	public int maxSpeed;
	
	public Car1() {
		//this("abz","xyz","MH36 3838",160);
		System.out.println("This is default constructor");
		
	}

	public Car1(String brand, String model, String number, int maxSpeed) {
			
		this();
		this.brand = brand;
		this.model = model;
		this.number = number;
		this.maxSpeed = maxSpeed;
		this.display();
	}
	
	
	void display()
	{
		System.out.println("Car Brand Name:"+this.brand);
		System.out.println("Car Model:"+this.model);
		System.out.println("Car Number:"+this.number);
		System.out.println("Car Maximum Speed:"+this.maxSpeed);
	}
		
}
public class ThisKeywordExample {

	public static void main(String[] args) {
		Car1 car=new Car1("abz","xyz","MH36 3838",160);

	}

}
