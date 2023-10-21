package com.io;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("enter a value:");
		int a =scanner.nextInt();
		
		System.out.println("enter a value:");
		long b =scanner.nextLong();
		
		System.out.println("enter a value:");
		boolean c=scanner.nextBoolean();
		
	
		
		System.out.println("enter a value:");
		scanner.nextLine();
		String st=scanner.nextLine();
		
		
		System.out.println("enter a value:");
		double d=scanner.nextDouble();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(st);

	}

}
