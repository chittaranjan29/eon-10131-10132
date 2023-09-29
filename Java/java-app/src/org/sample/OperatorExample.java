package org.sample;

public class OperatorExample {

	public OperatorExample() {
		
		int a=9,b=6;
		boolean status=true;
		
		System.out.println(a+b);
		System.out.println(a>b);
		System.out.println(a<=b);
		System.out.println(a>b && a>0);
		System.out.println(a>b || a>0);
		System.out.println(!status);
		System.out.println(a & b);
		
		// a = 1011 
		// b = 1000
		//     1000  
		System.out.println(a | b);
		System.out.println(a>>2);
		System.out.println(b<<2);
		
		a+=5; //a=a+5
		a*=2; //a=a*2
		
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(--a);
		System.out.println(++b);
		
		int result=(a>b)?(a+b):(a-b);
		
			
	}

}
