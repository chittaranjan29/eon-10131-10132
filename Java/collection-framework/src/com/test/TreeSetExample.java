package com.test;
import java.util.*;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	
	public static void main(String args[])
	{
		TreeSet<Integer> treeSet=new TreeSet<>();
		
		treeSet.add(12);
		treeSet.add(89);
		treeSet.add(35);
		treeSet.add(67);
		treeSet.add(99);
		treeSet.add(15);
		treeSet.add(8);
		//treeSet.add(8); duplicates not allowed
		//treeSet.add(null); null not allowed
		
		System.out.println(treeSet);
		
	    Iterator<Integer> iterator=treeSet.descendingIterator();
	    while(iterator.hasNext())
	    {
	    	System.out.print(iterator.next()+", ");
	    }
	    
	    
	    System.out.println(treeSet.pollFirst());
	    System.out.println(treeSet);
	    
	    System.out.println(treeSet.pollLast());
	    System.out.println(treeSet);
	    
	    
	    System.out.println(treeSet.first());
	    System.out.println(treeSet.last()); 
	    
	
	    }
	

}
