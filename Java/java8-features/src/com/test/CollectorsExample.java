package com.test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Product
{
	int id;
	String name;
	double price;
	
	public Product(int id, String name, double price) {


		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
}




public class CollectorsExample {

	public static void main(String[] args) {
		
		Product product1=new Product(333, "Acer Laptop", 40000);
		Product product2=new Product(444, "Lenovo Laptop", 50000);
		Product product3=new Product(555, "HP Laptop", 45000);
		Product product4=new Product(666, "Dell Laptop", 60000);
		Product product5=new Product(777, "Macbook", 100000);
		
		List<Product> laptops=Arrays.asList(product1,product2,product3,product4,product5);
	
		//converting into set collection using Collectors
		
		//Collectors.toSet()
		Set<Double> productPriceList=laptops.stream()
				.map(x -> x.price)
				.collect(Collectors.toSet());
		System.out.println(productPriceList);
		
		//Collectors.toList()
		List<Double> productPriceList1=laptops.stream()
				.map(x -> x.price)
				.collect(Collectors.toList());
		System.out.println(productPriceList1);
		
		//sum of laptop prices
		
		Double totalPrice=laptops.stream()
					.collect(Collectors.summingDouble(x -> x.price));
		System.out.println(totalPrice);
		
		//average of laptop price
		
		Double avgPrice=laptops.stream()
				.collect(Collectors.averagingDouble(x -> x.price));
	System.out.println(avgPrice);
		
	    // count of laptop 
	Long count=laptops.stream()
			.collect(Collectors.counting() );
	System.out.println(count);
	}

}
