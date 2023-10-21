package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class FindPalindromeWordsInAString {

	public static void main(String[] args) {
		
		String st;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a string:");
		st=scanner.nextLine();
		
		String words[]=st.split(" ");
		System.out.println(Arrays.toString(words));

		for(String word:words)
		{
				String reverse="";
				if(word.length()>1)
				{
					for(int i=word.length()-1;i>=0;i--)
					{
						reverse=reverse+word.charAt(i);
					}
					
					if(word.equals(reverse))
					{
						System.out.println(word);
					}
			}
		}
		
		
		
		

	}

}
