package com.in.test;

public class FindMaximumValue {

	public static void main(String[] args) {
		
		int a=10, b=5,c=9;
		
		
		//if
		if(a>b)
		{
			System.out.println(a + " is greater");
		}
		
		
		//if-else
		
		if(a<b)
		{
			System.out.println(b + " is greater");
		}
		else
		{
			System.out.println(a+" is greater");
		}
		
		//if-elseif-else
		
		if(a>b && a>c)
		{
			System.out.println(a+" is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println(b + " is greater");
		}
		else
		{
			System.out.println(c + " is greater");
		}
		
		
		
		
		if(a<b && a<c)
		{
			System.out.println(a+" is smaller");
		}
		else if(b<a && b<c)
		{
			System.out.println(b + " is smaller");
		}
		else
		{
			System.out.println(c + " is smaller");
		}
		
		//nested if else
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is greater");
			}
		}
		else
		{
			if(b>a)
			{
				if(b>c)
				{
					System.out.println(b + " is greater");
				}
				
			}
			else
			{
				System.out.println(c + " is greater");
			}
		}
		
		
		
		
		

	}

}
