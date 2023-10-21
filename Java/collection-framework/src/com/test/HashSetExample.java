package com.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		
		HashSet<Integer> hashSet=new HashSet<>();
		
		hashSet.add(11);
		hashSet.add(22);
		hashSet.add(33);
		hashSet.add(44);
		hashSet.add(55);
		hashSet.add(66);
		hashSet.add(66);
		hashSet.add(null);
		
		System.out.println(hashSet);
		
		Iterator<Integer> iterator=hashSet.iterator();
		
		while(iterator.hasNext())
		{
			System.out.print(iterator.next()+", ");
		}
		
		

	}

}
