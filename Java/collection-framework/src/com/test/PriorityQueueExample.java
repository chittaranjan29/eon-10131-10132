package com.test;

import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		
		PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
		
		priorityQueue.add(11);
		priorityQueue.add(78);
		priorityQueue.add(34);
		priorityQueue.add(55);
		priorityQueue.add(93);
		priorityQueue.add(117);
		priorityQueue.add(5);
		
		
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue.poll());
		
		
		System.out.println(priorityQueue);
		
		System.out.println(priorityQueue.element());


	}

}
