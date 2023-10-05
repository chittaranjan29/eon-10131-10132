package com.oops.test;

public class CarExample {

	public static void main(String[] args) {
		//instantiation
		Car car=new Car("Wb7585","Demo","X100","Green","Disel",0);//object or instance
		
		
		
		car.dispaly();
		car.start();
		car.speedUp(40);
		car.slowDown(10);
		car.stop();
		
		System.out.println("=======================================");
		
		Car car1=new Car();
		car1.carNumber="WBH-78888";
		car1.carColor="Red";
		car1.carFuelType="Disel";
		car1.carModel="Y100";
		car1.carBrand="Demo1";
		
		car1.dispaly();
		car1.start();
		car1.speedUp(40);
		car1.slowDown(10);
		car1.stop();
		
		
		Car car3=new Car();
		car3=car1;
	}

}
