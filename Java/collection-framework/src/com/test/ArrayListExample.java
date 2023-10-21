package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		ArrayList<String> list1=new ArrayList<String>();
		
		
		List<Integer> list3=new ArrayList<>();
		
		
		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		
		System.out.println(list);
		
		
		
		list1.add("INDIA");
		list1.add("UK");
		list1.add("USA");
		System.out.println(list1);
		
		//standard for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+", ");
		}
		System.out.println();
		
		//advanced for loop 
		for(Integer a:list)
		{
			System.out.print(a+", ");
		}
		
		System.out.println();
		
		//foreach loop
		list.forEach(
				x -> System.out.print(x+", "));
		
		System.out.println();
		
		
		//using iterator
		Iterator<Integer> iterator=list.iterator();
		
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+", ");
		}
		
		System.out.println("List Iterator forward direction");
		//ListIterator
		//forword direction
		ListIterator<Integer> listIterator=list.listIterator();		
		while(listIterator.hasNext())
		{
			System.out.print(listIterator.next()+", ");
		}
		
		System.out.println();
		
		System.out.println("List Iterator backward direction");
			
		//reverse direction
		ListIterator<Integer> listIterator1=list.listIterator();
		while(listIterator1.hasPrevious())
		{
			System.out.print(listIterator1.previous()+", ");
		}
		
		
		
		list3.add(90);
		list3.add(78);
		list3.add(56);
		
		
		ArrayList<Integer> list4=new ArrayList<>(list3);
		ArrayList<Integer> list5=new ArrayList<>(30);
		System.out.println(list4);
		
		
		//list3.clear();
		System.out.println(list3);
		
		ArrayList<Integer> list6=(ArrayList<Integer>) list.clone();
		System.out.println(list6);
		
		System.out.println(list.contains(77));
		System.out.println(list.contains(11));
		
		System.out.println(list.get(3));
		list.remove(0);
		
		System.out.println(list);
		
		
		list.remove(new Integer(22));
		System.out.println(list);
		
		
		System.out.println(list3);
		list3.removeIf(x-> x%2!=0);
		System.out.println(list3);
		
		
		System.out.println(list.indexOf(44));
		System.out.println(list.lastIndexOf(33));
		
		list.set(0, 111);
		System.out.println(list);
		
				
		
	}

}
