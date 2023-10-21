package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		
		//Stream Source
		List<Integer> list=Arrays.asList(14,78,1,5,38,22,90);

		//creating a stream instance
		//Stream<Integer> stream=list.stream();
		
		
		//performing the first intermediate operation
		//stream=stream.map(x -> x*x);
		
		
		//performing the second intermediate operation
		//stream=stream.filter(a -> a%2!=0);
		
		
		//perofrming terminal operation
		//List<Integer> result=stream.collect(Collectors.toList());
		
		
		List<Integer> result=list.stream()
				.map(x -> x*x)
				.filter(x -> x%2!=0)
				.collect(Collectors.toList());
		
		Integer max=list.stream()
				.max(Integer::compare)  //method reference
				.get();
		
		Integer min=list.stream()
				.min(Integer::compare)
				.get();
		
		
				
		
		System.out.println(list);
		System.out.println(result);
		System.out.println(max);
		System.out.println(min);
		
		list.stream()
		.sorted()
		.forEach(x -> {System.out.print(x+",");});
		
	}

}
