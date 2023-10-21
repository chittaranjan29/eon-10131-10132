package com.io;

public class StringProgram1 {

	public static void main(String[] args) {
		String st=new String("Welcome to Java20 Programming!!");
		char ch;
		int alphabets=0, c=0,v=0,d=0,s=0;
		st=st.toLowerCase();
		for(int i=0;i<st.length();i++)
		{
			ch=st.charAt(i);
			
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
			{
				alphabets=alphabets+1;
				
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					v=v+1;
				}
				else
				{
					c=c+1;
				}
			}
			
			else if(ch>='0' && ch<='9')
			{
				d=d+1;
			}
			else if(ch==' ')
			{
				s=s+1;
			}
			
		
		}
		System.out.println("Number of alphabets:"+alphabets);
		System.out.println("Number of vowels:"+v);
		System.out.println("Number of consonants:"+c);
		System.out.println("Number of digits:"+d);
		System.out.println("Number of whitespaces:"+s);
		System.out.println("Number of words:"+(s+1));

	}

}
