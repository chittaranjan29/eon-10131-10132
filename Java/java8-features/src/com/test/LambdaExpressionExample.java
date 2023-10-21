package com.test;


interface Drawable
{
	public void draw();
}


interface Addition
{
	public int  add(int a,int b);
}



public class LambdaExpressionExample {

	public static void main(String[] args) {
	
		int width=10;
		
		Drawable drawable= () ->{
			System.out.println("Drawing: "+width);
		};
		
		drawable.draw();
		
		
		
		
		Addition addition=(int a,int b)->{
			return a + b;
		};
		
		
		System.out.println(addition.add(10, 20));
		

	}

}
