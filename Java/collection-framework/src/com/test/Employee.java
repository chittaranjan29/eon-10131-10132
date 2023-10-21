package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee>{

	int id;
	String name;
	double salary;
	
	
	
	public Employee() {
		
	}



	public Employee(int id, String name, double salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}


	/*
	 * @Override public int compareTo(Employee o) {
	 * 
	 * 
	 * if(salary==o.salary) { return 0; } else if(salary>o.salary) { return -1; }
	 * else { return 1; }
	 * 
	 * }
	 */
	
	@Override
	public int compareTo(Employee o) {
			
			return name.compareTo(o.name);
					
	}
	
	
	
	
	public static void main(String args[])
	{
		Employee e1=new Employee(35353,"Akash",50000); 
		Employee e2=new Employee(55522,"Kavita",30000); 
		Employee e3=new Employee(53555,"Payush",40000); 
		Employee e4=new Employee(35353,"Zoya",45000); 
		Employee e5=new Employee(12355,"Bhushan",47000); 
		
		List<Employee> employees=new ArrayList<>();
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		
		
		System.out.println(employees);
		
		Collections.sort(employees);
		
		
		System.out.println(employees);
		
		
	}







	
	

}
