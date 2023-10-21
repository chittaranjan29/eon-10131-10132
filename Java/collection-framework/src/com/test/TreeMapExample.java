package com.test;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<String, String> map=new TreeMap<>();
		
		map.put("A", "Anil");
		map.put("V", "Vikram");
		map.put("H", "Harsh");
		map.put("P", "Prakash");
		map.put("T", "Tarun");
		map.put("M", "Mohini");
		
		System.out.println(map);
		
		System.out.println(map.ceilingKey("A"));
		System.out.println(map.firstEntry());
		System.out.println(map.firstKey());
		
		System.out.println(map.lastEntry());
		System.out.println(map.lastKey());
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		
		
		System.out.println(map.higherKey("M"));
		System.out.println(map.lowerKey("H"));
		
		System.out.println(map.pollFirstEntry());
		System.out.println(map);
		
		System.out.println(map.pollLastEntry());
		System.out.println(map);
		
	}

}
