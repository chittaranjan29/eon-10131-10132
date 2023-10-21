package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputExample {

	public static void main(String[] args) throws IOException {
		
		//converts byte stream into character stream
		InputStreamReader inputStreamReader=new InputStreamReader(System.in);
		//reads the character stream
		BufferedReader bufferedReader=new BufferedReader(inputStreamReader, 16);
		
		System.out.println("Enter a sentence:");
		String st=bufferedReader.readLine();
		System.out.println(st);
		
		System.out.println("Enter a character:");
		char ch=(char) bufferedReader.read();
		System.out.println(ch);
		
		
		
		System.out.println("Enter a value:");
		bufferedReader.readLine();
		int a=Integer.parseInt(bufferedReader.readLine());
		System.out.println(a);
		
		System.out.println("Enter a value:");
		float b=Float.parseFloat(bufferedReader.readLine());
		System.out.println(b);
		
		System.out.println("Enter a value:");
		long c=Long.parseLong(bufferedReader.readLine());
		System.out.println(c);
		
		System.out.println("Enter a value:");
		double d=Double.parseDouble(bufferedReader.readLine());
		System.out.println(d);
		
		System.err.println("Error message");

	}

}
