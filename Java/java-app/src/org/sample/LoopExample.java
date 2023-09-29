package org.sample;

public class LoopExample {
	public static void main(String[] args) {
	
			for(int i=1;i<=10;i++)    //11<10
			{
				System.out.println(i);
			}
			
			
			int i=1;
			
			for(;i<=20;)
			{
				System.out.println(i);
				i++;
			}
			/*
			 * for(;true;) { System.out.println("hello world!"); }
			 */
			
			int j=50;
			while(j<=20)
			{
				System.out.println(j);
				j++;
			}
			
			
			
			do
			{
				System.out.println(j);
			}
			while(j<=20);
			
			
		
	}

}
