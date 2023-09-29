package org.sample;

public class JumpStatementsExample {

	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}
			
			System.out.println(i);
		}
		
		System.out.println("======================================");
		
		
		for(int i=1;i<=10;i++)
		{
			
			if(i==3)
			{
				continue;
			}
			
			if(i==8)
			{
				break;
			}
			
			System.out.println(i);
		}

	}

}
