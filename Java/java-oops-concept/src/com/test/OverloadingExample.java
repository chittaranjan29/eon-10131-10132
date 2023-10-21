package com.test;
class Helper
{
	public int multiply(int a,int b)
	{
		return a*b;
	}
	
	public double multiply(double a,double b)
	{
		return a*b;
	}
	
	public double multiply(float a,float b)
	{
		return a*b;
	}
	
	public double multiply(double a,double b,double c)
	{
		return a*b*c;
	}
}
public class OverloadingExample {

	public static void main(String[] args) {
		Helper helper=new Helper();
		
		System.out.println(helper.multiply(10.45,20.78));
		

	}

}
