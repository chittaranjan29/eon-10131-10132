package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionTypes {

	public static void main(String[] args) {
	
		int a=10, b=0;
		String st=null;
		
		System.out.println(a/0);//unchecked exception
		System.out.println(st.length());//unchecked exception
		
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of b");
		
		try
		{
			b=Integer.parseInt(bufferedReader.readLine());//checked exception
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}

}
