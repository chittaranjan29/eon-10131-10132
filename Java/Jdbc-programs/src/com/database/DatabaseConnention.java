package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnention {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			Connection connection=null;
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirstdatabase", "root", "root") ;
			
			if(connection!=null)
			{
				System.out.println("Connection is Successfull!!");
			}
			
			Statement statement=connection.createStatement();		
			ResultSet result=statement.executeQuery("select * from student");
			
			while(result.next())
			{
				System.out.println(result.getInt(1)+" "+result.getString(2)+" "+result.getString(3)+" "+result.getString(4));
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}

}
