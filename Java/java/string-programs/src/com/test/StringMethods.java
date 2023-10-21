package com.test;

import java.util.Arrays;

public class StringMethods {
	
	public static void main(String args[])
	{
		String st="   ";
		String st1="Hello";
		String st2="hello";
		String st3="   welcome to string programming    ";
		//empty string - length is 0
		//non - empty - length is non zero
		System.out.println(st.isEmpty()); 
		System.out.println(st.isBlank()); 
		
		System.out.println(st1.equals(st2));
		System.out.println(st1.equalsIgnoreCase(st2));
		
		String array[]=st3.split(" ");
		
		System.out.println(Arrays.toString(array));
		
		array=st3.split("");
		
		System.out.println(Arrays.toString(array));
		
		
		array=st3.split("o");
		System.out.println(Arrays.toString(array));
		
		System.out.println(st3.indexOf('e'));
		System.out.println(st3.lastIndexOf('e'));
		
		
		System.out.println(st3);
		System.out.println(st3.trim());
		
		System.out.println(st3.contains("str"));
		System.out.println(st3.contains("abc"));
	}

}
