package com.string;

public class StringExample {

	public static void main(String[] args) {
		
		String st="Hello World";							
		String st1=new String("String example");											
		st="Welcome to java";
		
		System.out.println(st.length());
		System.out.println(st.charAt(0));
		System.out.println(st.contains("java"));
		System.out.println(st.concat("!!"));
		System.out.println(st.compareTo(st));
		System.out.println(st.equals(st1));
		System.out.println(st.indexOf('j'));
		System.out.println(st.lastIndexOf('a'));
		System.out.println(st.substring(0,7));
		System.out.println(st.endsWith("c++"));
		
		
		String test="   "; 
		//isBlank method checks if the specified string object contains no characters or only white spaces  
		System.out.println(test.isBlank());
		
		//isEmpty checks if the specified object length is 0 or not.
		System.out.println(test.isEmpty());
		
		System.out.println(st.replace("java", "c++"));
		
		st=st.replace("java", "c++");
		
		System.out.println(st.toLowerCase());
		System.out.println(st.toUpperCase());
		
		
		char array[]=st.toCharArray();
		
		System.out.println(st.startsWith("Welcome"));
		System.out.println(st.compareToIgnoreCase(test));
		
		
		
		for(int i=0;i<=st.length()-1;i++)
		{
			System.out.println(st.charAt(i));
		}
		
		
		
	}
}
