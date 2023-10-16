package org.sample;

import com.abc.*;
import static java.lang.System.*;

public class Sample {

	public void sample()
	{
		out.println("This is the sample method");
	}
	
	public static void main(String args[])
	{
		Test test=new Test();
		test.demo();
	}
}
