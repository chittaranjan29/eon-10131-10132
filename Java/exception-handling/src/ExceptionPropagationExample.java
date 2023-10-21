
public class ExceptionPropagationExample {
	void method3()
	{
		System.out.println("method3 invoked" );
		System.out.println(10/0);
	}
	
	void method2()
	{
		System.out.println("method2 invoked" );
		method3();
	}
	
	void method1()
	{
		System.out.println("method1 invoked" );
		method2();
	}
	
	
	public static void main(String[] args) {
		new ExceptionPropagationExample().method1();

	}

}
