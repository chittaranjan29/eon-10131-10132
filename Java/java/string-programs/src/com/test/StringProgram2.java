package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringProgram2 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string:");
		String st=bufferedReader.readLine();
		String reverse="";
		
		for(int i=st.length()-1;i>=0;i--)
		{
			reverse=reverse+st.charAt(i);
		}
		//System.out.println(reverse);	
		
		if(st.equals(reverse))
		{
			System.out.println("It's a Palindrome string");
		}
		else
		{
			System.out.println("It's not a Palindrome string");
		}
		

	}

}
