package com.test.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiDimensionalArrayExamle {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		
		
		int	arr[][][]= {
						{{12,45},{67,89}},
						{{78,34},{44,90}}
		};
		
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				for(int k=0;k<2;k++)
				{
					System.out.println("arr["+i+"]["+j+"]["+k+"]"+arr[i][j][k]);
				}
			}
		}
		
		int first, second, third;
		BufferedReader bufferedReader =new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first dimension:");
		first=Integer.parseInt(bufferedReader.readLine());
		System.out.println("Enter second dimension:");
		second=Integer.parseInt(bufferedReader.readLine());
		System.out.println("Enter third dimension:");
		third=Integer.parseInt(bufferedReader.readLine());
		
		int	arr1[][][]=new int[first][second][third];
		
		for(int i=0;i<first;i++)
		{
			for(int j=0;j<second;j++)
			{
				for(int k=0;k<third;k++)
				{
					System.out.println("Enter element at "+"arr["+i+"]["+j+"]["+k+"]:");
					arr1[i][j][k]=Integer.parseInt(bufferedReader.readLine());
				}
			}
		}
		
		System.out.println("======================================================");
		for(int i=0;i<first;i++)
		{
			for(int j=0;j<second;j++)
			{
				for(int k=0;k<third;k++)
				{
					System.out.println("arr["+i+"]["+j+"]["+k+"]"+arr1[i][j][k]);
				}
			}
		}
		
	}

}
