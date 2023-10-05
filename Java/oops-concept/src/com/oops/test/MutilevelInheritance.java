package com.oops.test;
class Books
{
	public String name="Parent Book";
	public void parentBook()
	{
		System.out.println("category:"+this.name);
		System.out.println("parent book invoked");
	}
}

class StoryBook extends Books
{
	public String name="Story Book";
	public void storyBook()
	{
		System.out.println("category:"+this.name);
		System.out.println("story book invoked");

	}
}


class ShortStoryBook extends StoryBook
{
	public String name="Short Story Book";
	public void shortStoryBook()
	{
		System.out.println("category:"+this.name);
		System.out.println("Short story book invoked");
	}
}

public class MutilevelInheritance {

	public static void main(String[] args) {
		
		ShortStoryBook shortStoryBook=new ShortStoryBook();
		shortStoryBook.parentBook();
		shortStoryBook.storyBook();
		shortStoryBook.shortStoryBook();

	}

}
