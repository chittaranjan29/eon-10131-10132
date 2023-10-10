package com.string;

import java.util.Scanner;

public class StringProblem1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any string:");
		String st=scan.nextLine();
		int alphabets=0,vowels=0, consonants=0, spaces=0, digits=0, special=0 ;
		char ch;
		for(int i=0;i<st.length();i++)
		{
			ch=st.charAt(i);
			
			if((ch>='a' && ch<='z')  || (ch>='A' && ch<='Z'))
			{
				alphabets++;
				if(ch=='a' || ch=='e' || ch=='i'||ch=='o'||ch=='u'||ch=='A' || ch=='E' || ch=='I'||ch=='O'||ch=='U')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
			else if(ch==' ')
			{
				spaces++;
			}
			else if(ch>='0' && ch<='9')
			{
				digits++;
			}
			else
			{
				special++;
			}
			
			
		}
		
		
		System.out.println("Count of alphabets:"+alphabets);
		System.out.println("Count of vowels:"+vowels);
		System.out.println("Count of consonants:"+consonants);
		System.out.println("Count of digits:"+digits);
		System.out.println("Count of spaces:"+spaces);
		System.out.println("Count of special character:"+special);
		System.out.println("Count of words:"+(spaces+1));
	}

}
