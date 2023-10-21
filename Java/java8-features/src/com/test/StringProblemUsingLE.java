package com.test;
interface LogestSubstring
{
	public String test(String st);
}
public class StringProblemUsingLE {

	public static void main(String[] args) {
		
		String st="Welcome to Java Programming"; //Programming

		LogestSubstring ob = (String s) -> {
			int length=0;
			String substring="";
			
			String array[]=st.split(" ");
			
			for(String word:array)
			{
				if(word.length()>length)
				{
					length=word.length();
					substring=word;
				}
			}
			
			return substring;
		};
		
		
	System.out.println(ob.test(st));
	}

}
