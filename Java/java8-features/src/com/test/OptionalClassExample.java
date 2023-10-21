package com.test;

import java.util.Optional;

public class OptionalClassExample {

	public static void main(String[] args) {
	
		String name="Java";
		
		//before Java 8
		if(name!=null)
		{
			System.out.println(name.length());
		}
		
		//from Java 8
		
		Optional<String> opt=Optional.of(name);
		opt.ifPresent(x -> System.out.println(x.length()));
		
		
		String name1=null;
		
		System.out.println(Optional.ofNullable(name1).orElse("c++"));
		System.out.println(Optional.ofNullable(name1).orElseGet(()->"c++"));
		//System.out.println(Optional.ofNullable(name1).orElseThrow(IllegalArgumentException::new));
		//System.out.println(Optional.ofNullable(name1).orElseThrow(()->new IllegalArgumentException()));

		System.out.println(opt);
		System.out.println(opt.get());
	}

}
