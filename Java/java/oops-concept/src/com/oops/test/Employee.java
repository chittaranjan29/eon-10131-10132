package com.oops.test;

public class Employee {
	
	//Data members
	public long employeeId;
	public String employeeName;
	public String designation;
	public int leaveBalance;
	public double salary;
	
	//default constructor is used to declare empty object
	public Employee()
	{
		System.out.println("default constructor invoked");
	}
	
	//parameterized constructor is used to declare and initialize the object
	public Employee(long id,String name,String designation,int balance,double salary)
	{
		System.out.println("parameterized constructor invoked");
		this.employeeId=id;
		this.employeeName=name;
		this.salary=salary;
		this.designation=designation;
		this.leaveBalance=balance;	
	}
	
	//Copy constructor is used to create an object from another object of the same class
	public Employee(Employee obj)
	{
		this.employeeId=obj.employeeId;
		this.employeeName=obj.employeeName;
		this.leaveBalance=obj.leaveBalance;
		this.designation=obj.designation;
		this.salary=obj.salary;
		
	}
	
	//Methods
	public void applyLeave()
	{
		
		System.out.println("Leave appied");
	}
	
	public void login()
	{
		System.out.println("Employee logged in");
	}
	
	public void loggedOut()
	{
		System.out.println("Employee logged out");
	}
	
	public void drawSalary()
	{
		System.out.println("Salary credited");
	}
	
	
	
}
