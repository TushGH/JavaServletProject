package loginandregistration;

import java.sql.Connection;

import java.sql.DriverManager;

public class loginclass implements Loginprovider {

	static Connection con = null;
	public static Connection getCon()
	{
		try
		{
			Class.forName("com.mysql.jc.jdbc.Driver");
			con=DriverManager.getConnection(connUrl,username,password);
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
