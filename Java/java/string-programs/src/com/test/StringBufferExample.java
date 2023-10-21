package com.test;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer st=new StringBuffer("Hello world");
		System.out.println(System.identityHashCode(st));
		
		st=new StringBuffer("Hi");	
		System.out.println(System.identityHashCode(st));
		st.append(" there");
		System.out.println(System.identityHashCode(st));
		
		
		st.insert(8,"!!");
		System.out.println(st);
		
		System.out.println(st.replace(8, 10, "--"));
		System.out.println(st.reverse());
		
	}

}
