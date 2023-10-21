package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
	
	int id;
	String name;
	int age;
	
	public Student() {
		
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public static void main(String args[])
	{
		Student s1=new Student(1, "Amar", 23);
		Student s2=new Student(2, "Omkar", 21);
		Student s3=new Student(3, "Daniel", 27);
		Student s4=new Student(4, "Kavita", 22);
		
		List<Student> students=new ArrayList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		
		System.out.println(students);
		
		Collections.sort(students, new AgeComparator());
		Collections.sort(students, new NameComparator());
		
		System.out.println(students);
	}

}
