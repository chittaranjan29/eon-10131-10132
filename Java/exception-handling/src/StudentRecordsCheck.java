import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

public class StudentRecordsCheck {

	public static void main(String[] args) {
	//student-id - 3-6digits only
		
		try(
				BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in)); 
				Scanner scan=new Scanner(System.in); 
			)
		{
			//resource to take input from user - opened - resource leak
			 
			long studentId=Integer.parseInt(bufferedReader.readLine());
			
			if(String.valueOf(studentId).length()>=3 && String.valueOf(studentId).length()<=6)//checking id is long type or not 
			{
				if(studentId==101)
				{
					System.out.println("Raman");
				}
				else if(studentId==102)
				{
					System.out.println("Shalini");
				}
				else
				{
					throw new StudentIdNotFoundException("Given Id is not found!!");
				}
			}
			else
			{
				throw new StudentIdFormatException("Incorrent student id type or format");
			}
	
			
		}
		catch(StudentIdNotFoundException e)
		{
			System.out.println(e.getMessage());
		}
		catch(StudentIdFormatException e)
		{
			System.out.println(e.getMessage());
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		finally
		{
			
		}

	}

}
