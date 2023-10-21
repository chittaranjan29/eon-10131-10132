package com.in.test;

import java.util.ArrayList;
import java.util.List;

public class ForeachExample {

	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		
		//java 8 feature(lambda expression)
		list.forEach(x -> {
			System.out.print(x*x +" ");
		});
		

	}

}
