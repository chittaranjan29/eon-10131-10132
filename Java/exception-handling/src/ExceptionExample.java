import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionExample {

	public static void main(String[] args) throws NumberFormatException, IOException  {
		
		int a=23, b=0;
		
		//Arithmetic Exception - unchecked Exception
		//System.out.println(a/b);
		
		
		//IOException - checked exception
		BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
	    a=Integer.parseInt(bufferedReader.readLine());
		
		//NullPionterException - unchecked Exception
		String st=null;
		//System.out.println(st.length());
		
		//st="";
		//StringIndexOutOfBiundsExeption - unchecked Exception
		//System.out.println(st.charAt(0));

	}

}
