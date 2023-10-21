package com.test;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<Integer> vector1=new Vector<>();
		
		vector1.add(11);
		vector1.add(22);
		vector1.add(33);
		vector1.add(44);
		vector1.add(55);
		vector1.add(66);
		
		System.out.println(vector1);
		
		vector1.set(0, 88);
		vector1.setElementAt(99, 4);
		
		System.out.println(vector1.capacity());
		vector1.ensureCapacity(20);
		System.out.println(vector1.capacity());
		
		
		Vector<Integer> vector2=new Vector<>();
		vector2.add(33);
		vector2.add(66);
		
		vector2.setSize(10);
		
		System.out.println(vector1);
		System.out.println(vector2);
		System.out.println(vector1.containsAll(vector2));
		
		System.out.println(vector1.firstElement());
		System.out.println(vector1.lastElement());
		
		Vector v1=new Vector<>();
		
		System.out.println(v1.capacity());
		
		v1.ensureCapacity(15);
		
		System.out.println(v1.capacity());
		
		v1.ensureCapacity(25);
		
		System.out.println(v1.capacity());
		
		v1.ensureCapacity(45);
		
		
		System.out.println(v1.capacity());
	}

}
