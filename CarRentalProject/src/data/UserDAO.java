package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



import model.user;


public class UserDAO {
	
	static Connection con;
	static PreparedStatement ps;
	public int insertuser(user newuser) {
		// TODO Auto-generated method stub
		int status =0;
		System.out.println("IN DAO");
		
		try
		{    Class.forName("com.mysql.jdbc.Driver");  
		   Connection con=DriverManager.getConnection(  
		      "jdbc:mysql://localhost:3306/test","root","");  
		
			
			 ps=con.prepareStatement("insert into user values(?,?,?)");
			 System.out.println(newuser.getUsername());
			 System.out.println(newuser.getPassword());
			 System.out.println(newuser.getFullName());
		     ps.setString(1,newuser.getUsername());
		     ps.setString(2, newuser.getPassword());
		     ps.setString(3,newuser.getFullName() );		   
		     status=ps.executeUpdate();
		     con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return status;
	}
	public static void main(String[] args) {
		
   }
	
}
