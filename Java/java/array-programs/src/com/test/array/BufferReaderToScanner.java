package com.test.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferReaderToScanner {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner=new Scanner(System.in); 
		
		System.out.println("Enter a number:");
		//int a=Integer.parseInt(bufferedReader.readLine());
		
		int a=scanner.nextInt();
		
		System.out.println("Enter a string:");
		//String st=bufferedReader.readLine();
		
		String st=scanner.nextLine();
		
		System.out.println("Enter a float value:");
		//float b=Float.parseFloat(bufferedReader.readLine());
		
		float b=scanner.nextFloat();
		
		System.out.println("Enter a character:");
		//char ch=(char)bufferedReader.read();
		
		char ch=(char)scanner.nextByte();
		
		System.out.println("Enter a long value:");
		//long l=Long.parseLong(bufferedReader.readLine());
		
		long l=scanner.nextLong();
		
		System.out.println("Enter a double value:");
		//double d=Double.parseDouble(bufferedReader.readLine());
		
		double d=scanner.nextDouble();
		
		
		System.out.println();
		
	}

}
