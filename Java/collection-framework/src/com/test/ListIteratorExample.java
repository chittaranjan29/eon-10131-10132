package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();

		list.add(11);
		list.add(22);
		list.add(33);
		list.add(44);
		list.add(55);
		
		
		
		
		ListIterator<Integer> listIterator=list.listIterator(list.size());
		
		while(listIterator.hasPrevious())
		{
			System.out.print(listIterator.previous()+", ");
		}

		System.out.println();
		
		listIterator=list.listIterator();
		
		while(listIterator.hasNext())
		{
			System.out.print(listIterator.next()+", ");
		}
	}

}
