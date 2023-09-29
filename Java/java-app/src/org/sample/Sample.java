package org.sample;

public class Sample {
	
	static
	{
		System.out.println("inside the static block");
	}

	public static void main(String[] args) {
		
		//variable declaration and initialization
		//compile time or static initialization 
		double princp=10000, roi=5.6, yrs=3, interest=0;
		
		//expression
		interest=(princp * roi * yrs)/100;
		
		//output statement
		System.out.println("Interest Amount="+interest);
		
	}

}
