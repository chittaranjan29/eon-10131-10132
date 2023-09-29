package org.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RuntimeInputUsingBufferedReader {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
	
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter a value:");
		int a=Integer.parseInt(bufferedReader.readLine());
		
		
		System.out.println("Enter a value:");
		float b=Float.parseFloat(bufferedReader.readLine());
		
		System.out.println("Enter a string:");
		String st=bufferedReader.readLine();
		
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(st);
		
		
		bufferedReader.close();
	}

}
