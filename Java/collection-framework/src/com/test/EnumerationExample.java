package com.test;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {
		Vector<Integer> vector1=new Vector<>();
		
		vector1.add(11);
		vector1.add(22);
		vector1.add(33);
		vector1.add(44);
		vector1.add(55);
		vector1.add(66);
		
		
		Iterator<Integer> iterator=vector1.iterator();
		
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+", ");
		}
		
		System.out.println();
		
		
		ListIterator<Integer> listIterator=vector1.listIterator();
		
		while(listIterator.hasNext())
		{
			System.out.print(listIterator.next()+", ");
		}
		
		System.out.println();

		Enumeration<Integer> enumeration=Collections.enumeration(vector1);
		
		while(enumeration.hasMoreElements())
		{
			System.out.print(enumeration.nextElement()+", ");
		}
	}

}
