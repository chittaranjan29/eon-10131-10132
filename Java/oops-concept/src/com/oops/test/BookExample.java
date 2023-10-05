package com.oops.test;
class Book
{
	private long id;
	private String name;
	private double price;
	private String author;
	
	public Book() {
		
	}

	public Book(long id, String name, double price, String author) {
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
}
public class BookExample {

	public static void main(String[] args) {
		
		Book book=new Book();
		
		book.setId(353532);
		book.setName("Programming in Java");
		book.setPrice(700);
		book.setAuthor("James Gosling");
		
		
		System.out.println(book.getId() +" "+book.getName()+" "+book.getPrice()+" "+book.getAuthor());;

	}

}
