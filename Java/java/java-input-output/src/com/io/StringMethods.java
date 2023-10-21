package com.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringMethods {

	public static void main(String[] args) throws IOException {
		
		String st=null;
		//BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter a String:");
		//st=bufferedReader.readLine();
		st="welcome to string programming";
		String st1="!!";
		System.out.println(st);
		System.out.println(st.length());
		System.out.println(st.charAt(0));
		System.out.println(st.toLowerCase());
		System.out.println(st.toUpperCase());
		System.out.println(st.substring(4));
		System.out.println(st.substring(4,8));
		System.out.println(st.startsWith("we"));
		System.out.println(st.endsWith("p"));
		System.out.println(st.concat(st1));
		System.out.println(String.valueOf(true));
		System.out.println(st.replace('w', 'W'));
		System.out.println(st.replace("welcome", "WELCOME"));

	}

}
