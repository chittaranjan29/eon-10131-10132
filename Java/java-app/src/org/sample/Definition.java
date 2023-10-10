package org.sample;

import org.sample.Definition.MyException;
import org.sample.Definition.Source;

class Definition
{
	class MyException extends Exception
	{
		public MyException(String message)
		{
			super(message);
		}
	}
	
	class Source
	{
		public  void checkAge(int age) throws MyException
		{
			if(age<=15)
			{
				throw new MyException("Age is less than 15");
			}
			else
			{
				System.out.println("eligible");
			}
		}
		
		public static void main(String[] args) 
		{
	
			Source source=new Definition().new Source();
		
			try {
				source.checkAge(23);
				source.checkAge(14);
			} catch (MyException e) {
				
				System.out.println(e.getMessage());
			}

		}
	}
}

