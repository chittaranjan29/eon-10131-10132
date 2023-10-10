package com.string;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer st=new StringBuffer("Hello world");
		st.append("!!");
		System.out.println(st);
		
		System.out.println(st.capacity());
		System.out.println(st.charAt(0));
		System.out.println(st.length());
		System.out.println(st.indexOf("w"));
		System.out.println(st.isEmpty());
		System.out.println(st.substring(5));
		System.out.println(st.reverse());
		System.out.println(st.delete(0, 5));
		System.out.println(st.insert(0, "test "));
		System.out.println(st.replace(0, 3, "hi"));
		

	}

}
