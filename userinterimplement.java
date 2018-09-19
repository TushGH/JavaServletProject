package loginandregistration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class userinterimplement implements userinter {

	
	static Connection con;
	static PreparedStatement ps;
	public int insertuser(userconstruct c) {
		// TODO Auto-generated method stub
		int status =0;
		
		try
		{
			 con=loginclass.getCon();
			 ps=con.prepareStatement("insert into user values(?,?)");
		     ps.setString(1,c.getUsername());
		     ps.setString(3, c.getPassword());
		     ps.setString(2,c.getName() );		   
		     status=ps.executeUpdate();
		     con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return status;
	}


	public userconstruct getuser(String username, String pass) {
      userconstruct c=new userconstruct();
      try {
    	  con=loginclass.getCon();
    	  ps=con.prepareStatement("Select * from user where userid=? and password=? ");
    	  ps.setString(1, username);
    	  ps.setString(2, pass);
      
        ResultSet rs = ps.executeQuery();
        while(rs.next())
        {
        	c.setUsername(rs.getString(1));
        	c.setPassword(rs.getString(2));
        	c.setName(rs.getString(3));
        }
      
      }
      catch(Exception e)
      {
    	  System.out.println(e);
    	  
      }
		return c;
	}

}
