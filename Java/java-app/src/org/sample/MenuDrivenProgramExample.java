package org.sample;

import java.util.Scanner;

public class MenuDrivenProgramExample {

	public static void main(String[] args) {
		
		String choice = "y";
		int operation=0;
		Scanner scanner=new Scanner(System.in);
		do
		{
			System.out.println("==================================");
			System.out.println("Enter 1 -> Addition");
			System.out.println("Enter 2 -> Subtraction");
			System.out.println("Enter 3 -> Multiplication");
			System.out.println("Enter 4 -> Division");
			System.out.println("==================================");
			System.out.println("Give your choice:");
			System.out.println("==================================");
			operation=scanner.nextInt();
			
			switch(operation)
			{
				case 1:System.out.println("Enter the first value:");
					   int a=scanner.nextInt();	
					   System.out.println("Enter the second value:");
					   int b=scanner.nextInt();	
					   System.out.println("Result="+(a+b));
					   break;
				case 2:System.out.println("Enter the first value:");
				   	   int c=scanner.nextInt();	
				       System.out.println("Enter the second value:");
				       int d=scanner.nextInt();	
				       System.out.println("Result="+(c-d));
				       break;	
				case 3:System.out.println("Enter the first value:");
				   	   int e=scanner.nextInt();	
				       System.out.println("Enter the second value:");
				       int f=scanner.nextInt();	
				       System.out.println("Result="+(e*f));
				       break;	
				case 4:System.out.println("Enter the first value:");
				   	   int g=scanner.nextInt();	
				       System.out.println("Enter the second value:");
				       int h=scanner.nextInt();	
				       System.out.println("Result="+(g/h));
				       break;
				default:System.err.print("Wrong Choice!!");       
			}
			
			System.out.println("Enter 'Y' to continue...");
			choice=scanner.next();
			
			
		}
		while(choice.equals("y")||choice.equals("Y") );
		
		System.out.println("==================================");
		System.out.println("Bye..Have a Good Day!!");
		System.out.println("==================================");

	}

}
