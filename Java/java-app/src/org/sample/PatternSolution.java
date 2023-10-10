package org.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PatternSolution {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			int n1 = 0,n2=0,n3=0;
		
				n1=Integer.parseInt(bufferedReader.readLine());
				n2=Integer.parseInt(bufferedReader.readLine());
				n3=Integer.parseInt(bufferedReader.readLine());							
			

			
			for(int i=1;i<=n1;i++)
			{
				for(int k=n1-i;k>=1;k--)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
			
			
	
			
			for(int i=1;i<=n2;i++)
			{
				for(int k=n2-i;k>=1;k--)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
			
	
			
			for(int i=1;i<=n3;i++)
			{
				for(int k=n3-i;k>=1;k--)
				{
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++)
				{
					System.out.print(i+" ");
				}
				System.out.println();
			}
			
			
	}

}
