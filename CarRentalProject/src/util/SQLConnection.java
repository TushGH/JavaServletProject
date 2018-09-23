package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
	static Connection con = null;
	public static Connection getCon()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/sakila","root","Prasi_1995");  
			
             System.out.println("Database connection successful");		
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			System.out.println("Database connection unsuccessful");
		}
	return con;	
	}
}