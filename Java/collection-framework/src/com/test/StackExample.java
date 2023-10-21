package com.test;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		
		stack.push(11);
		stack.push(22);
		stack.push(33);
		stack.push(44);
		stack.push(55);
		stack.push(66);
		stack.push(77);
		
		
		System.out.println(stack);
		
		
		stack.pop();
		
		System.out.println(stack);
		
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		stack.add(56);
		System.out.println(stack);
		
		LinkedList<Integer> list1=new LinkedList<>();
		
		list1.add(11);
		list1.add(34);
		list1.add(63);
		list1.add(25);
		list1.add(88);
		list1.add(175);
		
		stack.addAll(list1);
		System.out.println(stack);
		
		System.out.println(stack.elementAt(3));
		
		stack.ensureCapacity(30);
		System.out.println(stack.capacity());
		
		stack.remove(5);
		System.out.println(stack);
		
		
	}

}
