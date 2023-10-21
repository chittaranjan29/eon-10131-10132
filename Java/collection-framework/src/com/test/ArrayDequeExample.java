package com.test;

import java.util.ArrayDeque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		
		ArrayDeque<Integer> arrayDeque=new ArrayDeque<>();
		
		arrayDeque.add(35);
		arrayDeque.add(56);
		arrayDeque.add(3);
		arrayDeque.add(22);
		arrayDeque.add(39);
		arrayDeque.add(32);
		
		System.out.println(arrayDeque);
		
		arrayDeque.addFirst(77);
		arrayDeque.addLast(59);
		
		System.out.println(arrayDeque);
		
		arrayDeque.removeFirst();
		System.out.println(arrayDeque);
		arrayDeque.removeLast();
		System.out.println(arrayDeque);
		


	}

}
