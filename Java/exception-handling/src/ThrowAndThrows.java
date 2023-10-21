import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowAndThrows {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int a,b;
		try
		{
			BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter value of a:");
			a=Integer.parseInt(bufferedReader.readLine());
			System.out.println("Enter value of a:");
			b=Integer.parseInt(bufferedReader.readLine());
			
			
			if(b==0)
			{
				throw new IOException("Value of b should be above 0");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			System.out.println(e.getClass());
			System.out.println(e.getStackTrace());
		}

	}

}
