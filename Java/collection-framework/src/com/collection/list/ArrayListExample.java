package com.collection.list;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		List<Integer> list1=new ArrayList<Integer>();
		
		
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(11);
		
		System.out.println(list);
		
		
		
		list1.add(66);
		list1.add(77);
		list1.add(88);
		list1.add(99);
		list1.add(111);
		
		
		System.out.println(list1);
		
		
		ArrayList<String> countries=new ArrayList<String>(10);
		
		countries.add("India");
		countries.add("USA");
		countries.add("UK");
		countries.add("UAE");
		countries.add("Russia");
		
		System.out.println(countries);
		
		//Looping over
		//Way 1 : using standard loop
		
		for(int i=0;i<countries.size();i++)
		{
			System.out.print(countries.get(i)+",");		
		}
		
		System.out.println();
		
		
		//Way 2 : using Advanced for loop
		
		for(String name:countries)
		{
			System.out.print(name+",");
		}
		
		System.out.println();
		
		
		//Way 3:Using Iterator		
		Iterator<String> iterator=countries.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+",");
		}
		
		
		System.out.println();
		
		//Way 4:Using Foreach loop - java 8
		countries.forEach(
				country -> 
			System.out.print(country+",")
			);
		
		
		countries.set(4, "Australia");
		System.out.println(countries);
		
		countries.remove(0);
		System.out.println(countries);
		
		countries.remove("USA");
		System.out.println(countries);
		
	
		
		countries.clear();
		System.out.println(countries);

		list.addAll(list1);
		System.out.println(list);
		
		ArrayList<Integer> list3=(ArrayList<Integer>) list.clone();
		System.out.println(list3);
		
		list.ensureCapacity(20);
		
		System.out.println(list.contains(22));
		System.out.println(list.containsAll(list1));
		System.out.println(list.indexOf(55));
		System.out.println(list.isEmpty());
		System.out.println(list.lastIndexOf(11));
		
		
		System.out.println(list);
		list.removeAll(list1);
		System.out.println(list);
		
		
		
	}

}
