package org.sample;

public class IfExample {

	public static void main(String[] args) {
		
		int a=10,b=20,c=15;
		boolean status=false;
		
		if(a>15) //10>15 ->false
		{
			System.out.println(a+" is greater than 15");
		}
		else
		{	
		    System.out.println(a+" is greater than 15");
		}
	
			
		if(!status || status) //!false || false   true || false - true
		{
			System.out.println("welcome to Java");
		}
		
		
		
		if(a<b && a<c)
		{
			System.out.println(a +" is smallest");
		}
		else if(b<a && b<c)
		{
			System.out.println(b +" is smallest");
		}
		else if(c<a && c<b)
		{
			System.out.println(c + "is smallest");
		}
		else
		{
			System.out.println("none of the above conditions are true");
		}
		
		
		if(a<b)
		{
			if(a<c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
		}
		else
		{
			if(b<c)
			{
				System.out.println(b);
			}
			else
			{
				System.out.println(c);
			}
		}
		
	}

}
