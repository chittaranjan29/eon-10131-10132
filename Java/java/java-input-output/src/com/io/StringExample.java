package com.io;

public class StringExample {

	public static void main(String[] args) {
		
		//objects are created in heap memory
		String st1=new String("Hello");
		String st2=new String("Hello");
		
		//objects are created in constant pool
		String st3="Hello";
		String st4="Hello";
		
		System.out.println(Integer.toHexString(System.identityHashCode(st1)));
		System.out.println(Integer.toHexString(System.identityHashCode(st2)));
		
		
		System.out.println(Integer.toHexString(System.identityHashCode(st3)));
		System.out.println(Integer.toHexString(System.identityHashCode(st4)));

	}

}
