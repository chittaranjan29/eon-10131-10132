package com.test;
class Person
{
	private String name;
	private int age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
		
}


public class EncapsulationExample {

	public static void main(String[] args) {
		
		Person person=new Person();
		person.setName("Yogesh");
		person.setAge(24);
		
		System.out.println(person.getAge());
		System.out.println(person.getName());

	}

}
