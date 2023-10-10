package com.oops.test;
class ShoppingCart
{
	public double defaultPrice=500;
	public int defaultQuantity=1;
	
	public void addToCart(String productName)
	{
		System.out.println("Name:"+productName+"\t"+"Quantity:" + this.defaultQuantity+"\t Total Price:" + this.defaultPrice*this.defaultQuantity);
	}
	
	
	public void addToCart(String productName,int quantity)
	{
		System.out.println("Name:"+productName+"\t"+"Quantity:" + quantity+"\t Total Price:" + this.defaultPrice * quantity);
	}
	
	public void addToCart(String productName,int quantity,double price)
	{
		System.out.println("Name:"+productName+"\t"+"Quantity:" + quantity+"\t Total Price:" + price * quantity);
	}
}


public class ShoppingCartExample {

	public static void main(String[] args) {
	
		ShoppingCart cart=new ShoppingCart();
		
		cart.addToCart("head phone");
		
		cart.addToCart("Mobile charger",3);
		
		cart.addToCart("Dell laptop",2,55000);

	}

}
