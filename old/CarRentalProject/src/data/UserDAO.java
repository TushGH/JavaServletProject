package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.user;


public class UserDAO {
	
	static Connection con;
	static PreparedStatement ps;
	public String role;
	public int authentecateUser(String Username , String Password){
		int status = 0 ;
		System.out.println(Username);
		String query = "select password,Role from user where username = ?";
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			   Connection con=DriverManager.getConnection(  
			      "jdbc:mysql://localhost:3306/sakila","root","Prasi_1995");  
	    	  ps=con.prepareStatement(query);
	    	  ps.setString(1, Username);
	    	  
	      
	        ResultSet rs = ps.executeQuery();
	        
	        rs.next();
	        
	        role=rs.getString("Role");
	        //System.out.println(rs.getString(1));
	            
	      
			   if(Password.equals(rs.getString("password"))){
				   status = 1 ;
				   
			   }
			   con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	return status ;
	}
	public  int insertuser(user newuser) {
		// TODO Auto-generated method stub
		int status =0;
		System.out.println("IN DAO");
		
		try
		{   Class.forName("com.mysql.jdbc.Driver");  
		   Connection con=DriverManager.getConnection(  
		      "jdbc:mysql://localhost:3306/sakila","root","Prasi_1995");  
		
			
			 ps=con.prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?,?)");
			 System.out.println(newuser.getUsername());
			 System.out.println(newuser.getPassword());
			 System.out.println(newuser.getFullName());
			 System.out.println(newuser.getRole());
			 System.out.println(newuser.getLicence());
			 System.out.println(newuser.getAddress());
			 System.out.println(newuser.getUTAID());
			 System.out.println(newuser.getEmail());
			 System.out.println(newuser.getPhoneNo());
			 System.out.println(newuser.getAutoClub());
		     ps.setString(1,newuser.getUsername());
		     ps.setString(2, newuser.getPassword());
		     ps.setString(3,newuser.getFullName() );
		     ps.setString(4, newuser.getRole());
		     ps.setString(5, newuser.getLicence());
		     ps.setString(6, newuser.getAddress());
		     ps.setString(7, newuser.getUTAID());
		     ps.setString(8, newuser.getEmail());
		     ps.setString(9,newuser.getPhoneNo() );
		     ps.setString(10, newuser.getAutoClub());
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