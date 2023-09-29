package org.sample;

import java.util.Scanner;

public class RuntimeInputUsingScanner {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		
		System.out.println("Enter a value:");
		int n=scanner.nextInt();
		
		System.out.println("Enter a value:");
		float m=scanner.nextFloat();
		
		System.out.println("Enter a string");
		String st=scanner.next();
		
		
		System.out.println(n);
		System.out.println(m);
		System.out.println(st);
		
		
		scanner.close();

	}

}
