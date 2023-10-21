package com.test.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayExample1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
	
		int ar[]=new int[10];
		int []ar1=new int[10];
		
	    BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
	    
	    System.out.println("Enter the size of the array:");
	    int size=Integer.parseInt(bufferedReader.readLine());
	    int []ar3=new int[size];
	    
	    //runtime or dynamic initialization
	    for(int i=0;i<size;i++)
	    {	
	    	System.out.println("Enter the element at "+i+" index position:");
	    	ar3[i]=Integer.parseInt(bufferedReader.readLine());
	    }
	    
	    
	    for(int i=0;i<size;i++)
	    {	
	    	System.out.print(ar3[i]+" ");
	    	
	    }
	    
	    System.out.println();
	    
	    //compile-time or static initialization
	    int ar4[]= {11,22,33,44,55,66};
	    for(int i=0;i<=ar4.length-1;i++)
	    {
	    	System.out.print(ar4[i]+" ");
	    }
	    
	    
	    System.out.println();
	    
	    System.out.println(ar4[3]);
	    //ArrayIndexOutOfBoundsException
	    System.out.println(ar4[10]);
	    
	 
		
	}

}
