package com.test;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
	
		LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
		
		linkedHashSet.add("A");
		linkedHashSet.add("B");
		linkedHashSet.add("C");
		linkedHashSet.add("D");
		linkedHashSet.add("E");
		linkedHashSet.add("F");
		
		System.out.println(linkedHashSet);
		System.out.println(linkedHashSet.contains("C"));
		linkedHashSet.forEach(x -> System.out.println(x));
	
		

	}

}
