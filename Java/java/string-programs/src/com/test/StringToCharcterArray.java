package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StringToCharcterArray {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string:");
		char array[]=bufferedReader.readLine().toCharArray();
		
		System.out.println(Arrays.toString(array));
		
		
		char array1[]=new char[20];
		int i=0;	
		System.out.println("Enter a string:");
		int c=0;
		while((c=bufferedReader.read())!=-1 && (i<20))
		{
			array1[i++]=(char)c;
		}
		
		
		System.out.println(Arrays.toString(array1));
		String original=Arrays.toString(array1);
		System.out.println(original);

	}

}
