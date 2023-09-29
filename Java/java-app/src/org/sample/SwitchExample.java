package org.sample;

public class SwitchExample {

	public static void main(String[] args) {
		char choice='T';
		switch(choice)
		{
			case 'S':System.out.println("Sunday");break;
			case 'M':System.out.println("Monday");break;
			case 'T':System.out.println("Tuesday");break;
			case 'W':System.out.println("Wednesday");break;
			case 't':System.out.println("Thursday");break;
			case 'F':System.out.println("Friday");break;
			case 's':System.out.println("Saturday");break;
			default:System.out.println("wrong choice");break;
		}
		
		//case scope
		int ch=4;
		switch(ch)
		{
			case 1,2,3:{
				System.out.println("Hello");break;
				}
			case 4:{
				
			}
			case 5:{
				System.out.println("hi");break;
			}
			
			default:{
				System.out.println("wrong choice");break;
			}
		}
		
		
	//switch with arrow	
		switch(ch)
		{
			case 1,2,3 -> {System.out.println("Hello");}
			case 4, 5 -> {System.out.println("hi");}
	
		}

	}

}
