package com.test;

import java.io.FileOutputStream;

public class TryWithResourceExample {

	public static void main(String[] args) {
		
		try(FileOutputStream fileOutputStream=new FileOutputStream("F:\\java\\exception-handling\\sample.txt");)
		{
			String content="Java exception handling!!";
			byte arr[]=content.getBytes();
			fileOutputStream.write(arr);		
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("Resources are closed.");
	}

}
