package com.oops.test;

class Employee
{
	long id;
	String name;
	double salary;
    int leaveBalance=25;
    static String company="ABC private Ltd.";//common property for all the objects
	
	
	public Employee() {
		System.out.println("default constructor..");
	}


	public Employee(long id, String name, double salary, int leaveBalance) {
		
		this();//this is used to refer current class constructor
		
	    //this keyword is used to refer instance variables
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.leaveBalance=leaveBalance;
		
		this.display(); //this is used to refer current class method
	}
	
	void display()
	{
		this.applyLeaves(3, this);
		System.out.println(this.id+" "+this.name+" "+this.salary+" "+this.leaveBalance);
		
	}
	
	
	void applyLeaves(int days,Employee emp)
	{
		emp.leaveBalance=emp.leaveBalance-days;
	}
	

	
		
}





