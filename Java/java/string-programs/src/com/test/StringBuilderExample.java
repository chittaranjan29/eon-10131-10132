package com.test;

public class StringBuilderExample {

	public static void main(String[] args) {
		
		StringBuilder st=new StringBuilder("StringBuilder example");
		st.append("!!");
		st.insert(21, "!!");
		System.out.println(st);
		
		System.out.println(st.reverse());
		System.out.println(st.length());
		System.out.println(st.charAt(0));
		System.out.println(st.capacity());
		System.out.println(st.indexOf("S"));
		System.out.println(st.delete(22, 23));
		st.setCharAt(0, 's');
		
	}

}
