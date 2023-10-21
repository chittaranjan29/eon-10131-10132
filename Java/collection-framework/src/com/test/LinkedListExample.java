package com.test;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1=new LinkedList<>();
		List<Integer> list2=new LinkedList<>(); 
		
		list1.add(11);
		list1.add(34);
		list1.add(63);
		list1.add(25);
		list1.add(88);
		list1.add(175);
		
		System.out.println(list1);	
		
		list2.add(11);
		list2.add(34);
		list2.add(63);
		list2.add(25);
		list2.add(88);
		list2.add(175);
		
		System.out.println(list2);
		
		for(int i=0;i<list1.size();i++)
		{
			System.out.print(list1.get(i)+", ");
		}
		
		
		System.out.println();
		
		for(Integer a:list2)
		{
			System.out.print(a+", ");
		}
		
		System.out.println();
		
		
		list2.forEach(x -> System.out.print(x+", "));
		
		Iterator<Integer> iterator=list1.iterator();
		System.out.println();		
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+", ");
		}
		System.out.println();
		
		
		System.out.println(list1);
		list1.set(3, 56);
		System.out.println(list1);
		
		list1.clear();
		list1.remove();
		list1.remove(0);
		list1.remove(new Integer(56));
		
		
		

	}

}
