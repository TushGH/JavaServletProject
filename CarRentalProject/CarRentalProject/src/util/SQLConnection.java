package util;

import java.sql.*;



public class SQLConnection {
	static Connection con = null;
	public static Connection getCon()
	{
		try
		{
//			Class.forName("com.mysql.jdbc.Driver");  
//			 con=DriverManager.getConnection(  
//			"jdbc:mysql://localhost:3306/test","root","");  
//			Connection a = con ;
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