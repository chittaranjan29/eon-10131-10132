package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Function;

class Test
{
	public void test()
	{
		System.out.println("test method invoked");
	}
}


interface Sayable
{
	void say();
}


public class MethodReferenceExample {

	public static void main(String[] args) {
		
		
		Function<Integer, Double> sqrt=(Integer a) -> Math.sqrt(a); 		
		System.out.println(sqrt.apply(16));
		
		Function<Integer, Double> sqrt1=Math::sqrt;//Reference to a static method 
		System.out.println(sqrt1.apply(16));
		
		
		Test obj=new Test();
		Sayable sayable=obj::test;	//Reference to an instance method of a particular object
		
		sayable.say();
		
		
		String names[]= {"Anil","Sunita","Rahul","Kiran","Nandini"};
		for(String name:names)
		{
			System.out.print(name+",");
		}
		System.out.println();
		Arrays.sort(names,String::compareToIgnoreCase);// Reference to an instance method of an arbitrary object of a particular type 
		for(String name:names)
		{
			System.out.print(name+",");
						
		}
		
		
		//List to Set
		
		List<String> fruits=Arrays.asList("Apple","Banana","Orange");
		Function<List<String>, Set<String>> function=HashSet::new;//Reference to a constructor
		Set<String> fruitsSet=function.apply(fruits);
		System.out.println(fruitsSet);
		
		
		
		
		
		
		
	
		
		
		
		
	}

}
