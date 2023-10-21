package com.in.test;

public class SwitchExample {

	public static void main(String[] args) {
		
		int choice=9;
		//Fall through the execution
		//enhanced switch block 
		
		switch(choice)
		{
			case 1:System.out.println("Hello User!!");
				   break;
			case 2:System.out.println("Hi User!!");
			   	   break;	
			case 3:System.out.println("Welcome User!!");
		   	   	   break;
		   	   	   
			case 4,5,6:System.out.println("Bye User");
				   break;
				   
			case 7:
			case 8:
			case 9:System.out.println("Welcome back!!");
				   break;
		   	default:System.out.println("Wrong choice");  
		   		   break;
		}

	}

}
