package com.test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<String , String> linkedHashMap=new LinkedHashMap<>();
		linkedHashMap.put("A", "Amar");
		linkedHashMap.put("S", "Shalini");
		linkedHashMap.put("R", "Robin");
		linkedHashMap.put("I", "Ishita");
		linkedHashMap.put("D", "Dinesh");
		linkedHashMap.put("R", "Robin");
		linkedHashMap.put("I", "Indira");
		linkedHashMap.put(null, "No Name");
		linkedHashMap.put("K", null);
		
		System.out.println(linkedHashMap);
		
		
		for(Map.Entry m:linkedHashMap.entrySet())
		{
			System.out.println(m.getKey() + "=" +m.getValue());
		}
		
		
		System.out.println(linkedHashMap.keySet());
		System.out.println(linkedHashMap.values());
		
		System.out.println(linkedHashMap.get("K"));
		System.out.println(linkedHashMap.containsKey("A"));
		System.out.println(linkedHashMap.containsValue("Dinesh"));
		
	
		
		
	}

}
