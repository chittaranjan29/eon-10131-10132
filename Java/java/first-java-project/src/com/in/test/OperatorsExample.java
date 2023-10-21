package com.in.test;

public class OperatorsExample {

	public static void main(String[] args) {
	  
		int a=10, b=20;
	    boolean status=true;
		System.out.println(a+b); 
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		
		a*=10;  // a=a*10;
		a/=5;   // a=a/5
		
		System.out.println(a++);//a=a+1
		System.out.println(a--);//a=a-1
		System.out.println(++a);//a=a+1
		System.out.println(--a);//a=a-1
		
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		System.out.println(a>b && a>0);
		System.out.println(a>b || a>0);
		System.out.println(!status);
		
		
		a=5;
		b=4;
		System.out.println(a & b);
		
		//5 & 4 - 101 & 100
		
		//101
		//100
		
		//100 - 4 
		System.out.println(a | b);
		System.out.println(a ^ b);
		System.out.println(~ b);
		
		System.out.println(a>>3);
		System.out.println(a>>>3);
		System.out.println(a<<2);
		
		a=10;
		b=20;
		int result=(a>b)?a:b;
		System.out.println(result);
		
	}

}
