package com.test.array;

import java.util.Scanner;

public class StaticArrayInitialization {

	public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	 int ar[]= {12,45,67,89,45};
	 int ar2d[][]= {
			 {11,55,66,77},
			 {88,12,78,99},
			 {99,11,22,66}
	 };
	 
	
	 
	 
	 for(int i=0;i<3;i++)
	 {
		 for(int j=0;j<4;j++)
		 {
			 System.out.print(ar2d[i][j]+"\t");
		 }
		 
		 System.out.println();
	 }
	 
	 
	 
	 int array[][]=new int[10][10];
	 
	 int rows=0,columns=0;
	 System.out.println("Enter number of rows:");
	 rows=scanner.nextInt();
	 
	 System.out.println("Enter number of columns:");
	 columns=scanner.nextInt();
	 
	 for(int i=0;i<rows;i++)
	 {
		 for(int j=0;j<columns;j++)
		 {
			 System.out.print("Eneter element at "+i +" "+j+" position:");
			 array[i][j]=scanner.nextInt();
		 }
		 
		 System.out.println();
	 }
	 
	 
	 
	 
	 for(int i=0;i<rows;i++)
	 {
		 for(int j=0;j<columns;j++)
		 {
			 System.out.print(array[i][j]+"\t");
		 }
		 
		 System.out.println();
	 }

	}

}
