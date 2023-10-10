package com.test;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) throws IOException {
		
		int a=0, b=0, c=0;
	
		try(Scanner scanner=new Scanner(System.in);)
		{
			a=scanner.nextInt();
			b=scanner.nextInt();
			c=scanner.nextInt();
		}
		catch (Exception e) {
			
		}
		
		String s=null;	
		try
		{
			System.out.println(s.length());
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
		}
		
		catch(ArithmeticException | NullPointerException e)//specific exception handler
		{
			System.out.println(e.getMessage());
		}
		
		catch(Exception e) //generic exception handler
		{
			System.out.println("Error occurred");
		}
		finally
		{
		    System.out.println(a++);
			System.out.println(b--);
			System.out.println(Math.pow(a, b));
		}
		
		
	}

}
