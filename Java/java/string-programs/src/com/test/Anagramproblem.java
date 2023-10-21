package com.test;

import java.util.Arrays;

public class Anagramproblem {

	public static void main(String[] args) {
		
		String st="CAT";
		String st1="TACK";
		
		if(st.length()==st1.length())  // 3==3 true
		{
			st=st.toLowerCase();  //st=cat
			st1=st1.toLowerCase();    //st1=act
		
			char array1[]=st.toCharArray();  //array1=['c','a','t']
			char array2[]=st1.toCharArray(); //array2=['a','c','t'];
			
			Arrays.sort(array1); //['a','c','t']
			Arrays.sort(array2); //['a','c','t']
			
			if(Arrays.equals(array1, array2))
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Non-anagram");
			}
		}
		else
		{
			System.out.println("Non-anagram");
		}
		
		

	}

}
