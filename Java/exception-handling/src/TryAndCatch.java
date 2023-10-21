import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryAndCatch {
	
	public static void main(String args[])
	{
		int a,b;
		
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
		
		try
		{	
			int ar[]=new int[5];
			a=Integer.parseInt(bufferedReader.readLine());
			b=Integer.parseInt(bufferedReader.readLine());
			System.out.println(a/b);
			String st=bufferedReader.readLine();
			System.out.println(st.length());
			System.out.println(st.charAt(0));
			System.out.println(ar[10]);
			
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}	
		
		catch(NullPointerException | StringIndexOutOfBoundsException e)
		{
			System.out.println("NullPointer or StringIndexOutOfBounds exception ");
			System.out.println(e);
		}
		
		
		
		catch(Exception e) //generic
		{
			System.out.println("generic exception");
			System.out.println(e);
		}
		
		finally
		{
			System.out.println("Bye");
		}
		
	}

}
