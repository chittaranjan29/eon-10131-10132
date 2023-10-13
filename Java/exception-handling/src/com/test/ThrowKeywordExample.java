package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import javax.naming.directory.InvalidAttributesException;

public class ThrowKeywordExample {

	public static void main(String[] args) throws IOException
	{
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the age of the user:");
		int age=Integer.parseInt(bufferedReader.readLine());
		
		try
		{
			if(age>=18)
			{
				System.out.println("You are eligible for casting vote!!");
			}
			else
			{
				throw new InvalidAgeException("Age is below 18!!");
			}
		}
		catch (InvalidAgeException e) {
			
			System.out.println(e.getMessage());
		}
		
		catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		

	}

}
