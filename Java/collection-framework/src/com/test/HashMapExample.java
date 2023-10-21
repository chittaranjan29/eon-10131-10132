package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class HashMapExample {

	public static void main(String[] args) {
		
	  	HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
	  	
	  	hashMap.put(0, "India");
		hashMap.put(1, "Russia");
		hashMap.put(2, "Germany");
		hashMap.put(3, "USA");
		hashMap.put(4, "UAE");
		hashMap.put(5, "UK");
		hashMap.put(5, "Afganistan");
		hashMap.put(null, null);
		
		System.out.println(hashMap);
		
		for(Map.Entry m:hashMap.entrySet())
		{
			System.out.println(m.getKey() + "=" +m.getValue());
		}
		
		//hashMap.remove(4);
		hashMap.remove(4,"China");
		
		System.out.println(hashMap);
		
		System.out.println(hashMap.containsKey(6));
		System.out.println(hashMap.containsValue("India"));
		System.out.println(hashMap.isEmpty());
		System.out.println(hashMap.get(2));
		System.out.println(hashMap.get(23));
		System.out.println(hashMap.getOrDefault(23,"North Korea"));
		
		hashMap.putIfAbsent(6, "South Korea");
		System.out.println(hashMap);
		
		hashMap.replace(4, "Srilanka");
		System.out.println(hashMap);
		
		hashMap.merge(3, "UAE", (x,y)->y.toLowerCase());
		System.out.println(hashMap);
	
	}
		
		
		
		
	}


