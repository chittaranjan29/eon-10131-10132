package com.test;

public class StaticVariableExample {

	static String companyName="ABC Pvt. Ltd.";
	long id;
	String name;
	
	public StaticVariableExample(long id,String name)
	{
		this.id=id;
		this.name=name;
	}
	
	public void display()
	{
		System.out.println("Employee Id:"+this.id);
		System.out.println("Employee Name:"+this.name);
		System.out.println("Company Name:"+StaticVariableExample.companyName);
	}
	
	
	public static void main(String[] args) {
		
		StaticVariableExample emp1=new StaticVariableExample(151551,"Mr. R. Roy");
		StaticVariableExample emp2=new StaticVariableExample(344465,"Mr. A. Sharma");
		StaticVariableExample emp3=new StaticVariableExample(436645,"Mr. K. Lama");
		
		
		emp1.display();
		emp2.display();
		emp3.display();
		
		
	}

}
