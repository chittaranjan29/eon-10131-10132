package com.oops.test;

public class ThisKeywordExample {
	
	public static void main(String args[])
	{
		Employee employee1=new Employee(38777,"Mr. Ashok",50000,20);
		Employee employee2=new Employee(35355,"Mrs. Shalini",56000,20);
		Employee employee3=new Employee(25555,"Mr. Ravindra",60000,20);
		
		
		
		System.out.println(employee1.id +"\t" +employee1.name+" \t" +employee1.salary+"\t"+employee1.company );
		System.out.println(employee2.id +"\t" +employee2.name+" \t" +employee2.salary+"\t"+Employee.company );
		System.out.println(employee3.id +"\t" +employee3.name+" \t" +employee3.salary+"\t"+employee3.company );
		
		
		System.out.println(Integer.toHexString(employee1.company.hashCode()));
		System.out.println(Integer.toHexString(employee2.company.hashCode()));
		System.out.println(Integer.toHexString(employee3.company.hashCode()));
		
		
		System.out.println(Integer.toHexString(employee1.name.hashCode()));
		System.out.println(Integer.toHexString(employee2.name.hashCode()));
		System.out.println(Integer.toHexString(employee3.name.hashCode()));

	}

}
