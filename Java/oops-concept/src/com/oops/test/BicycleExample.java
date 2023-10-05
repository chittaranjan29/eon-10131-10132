package com.oops.test;
class BiCycle
{
	private String color;
	private int maxSpeed;
	private String companyName;
	
	public void test()
	{
		System.out.println("test");
	}
	
	public void test(int a)
	{
		System.out.println("test with a");
	}
	
	
	public void test(int a,int b)
	{
		System.out.println("test with a and b");
	}
	
	public long test(long a,long b)
	{
		return a+b;
	}
	
	
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
}



public class BicycleExample {

	public static void main(String[] args) {
		
		BiCycle biCycle=new BiCycle();
		biCycle.setColor("Red");
		biCycle.setMaxSpeed(30);
		biCycle.setCompanyName("Company A");
		
		
		System.out.println(biCycle.getColor());
		System.out.println(biCycle.getCompanyName());
		System.out.println(biCycle.getMaxSpeed());

	}

}
