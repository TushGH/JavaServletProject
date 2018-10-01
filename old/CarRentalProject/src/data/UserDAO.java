package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.ViewMyReservation;

public class UserDAO {
		static Connection con;
		static PreparedStatement ps;
		public void CancelReservationDAO(String confirmation) {
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
				      "jdbc:mysql://localhost:3306/carrental","root","");  
			String query="delete from reservedcars where Reservationid=?" ;
			ps=con.prepareStatement(query);
		    ps.setString(1,confirmation);
		    boolean b=ps.execute();
		    if(b) {
		    	System.out.println("executed the query");
		    }
		    else {
		    	System.out.println("Havenot executed the query");
		    }
		    con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
		
		public int UpdateDao(String name, String email, String phone, String addr, String newpassword, String username) {
			// TODO Auto-generated constructor stub
			int status = 0 ;
			String role;
			String query="UPDATE CARRENTAL.USER SET NAME=?,EMAIL=?,PHONE=?,ADDRESS=?,PASSWORD=? WHERE USERNAME=?";
			try {
				Class.forName("com.mysql.jdbc.Driver");  
				java.sql.Connection con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/carrental","root",""); 	      
				          PreparedStatement preparedStmt = con.prepareStatement(query);
					      preparedStmt.setString (1, name);
					      preparedStmt.setString   (2, email); 
					      preparedStmt.setString   (3, phone);
					      preparedStmt.setString   (4, addr);
					      preparedStmt.setString   (5, newpassword);
					      preparedStmt.setString   (6, username);		      
					      //if(newpassword==conpassword) {
						      preparedStmt.executeUpdate();					        
					      //}
					      //else {
					    	//  System.out.println("New password doesn't match");
					      //}
					      status=1;
					      con.close();
				 System.out.println("Database connection successful");		
			}
			
			catch(Exception e)
			{
				System.out.println(e);
				status=0;
				System.out.println("Database connection unsuccessful");
			}
			return status;
	}
		
		public List<ViewMyReservation> ViewReservationDAO(String startdate,String enddate){
			ViewMyReservation viewMy=null;
			List<ViewMyReservation> Result=new ArrayList<>();
		String query="select * from reservedcars where startdate>=CAST('?' AS DATE) and enddate<=CAST('?' AS DATE)";
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
				      "jdbc:mysql://localhost:3306/carrental","root","");  
			ps=con.prepareStatement(query);
		    ps.setString(1, startdate);
		    ps.setString(2, enddate);
		    ResultSet rs1 = ps.executeQuery();
		    while(rs1.next()) {
		    	viewMy = new ViewMyReservation();
		    	viewMy.setReservationid(rs1.getString("Reservationid"));
		    	viewMy.setCarName(rs1.getString("CarName"));
		    	viewMy.setStartTime(rs1.getString("StartTime"));
		    	viewMy.setstartdate(rs1.getString("StartDate"));
		    	viewMy.setEndTime(rs1.getString("EndTime"));
		    	viewMy.setenddate(rs1.getString("EndDate"));
		    	System.out.println(viewMy.getReservationid());
		    	System.out.println(viewMy.getCarName());
		    	System.out.println(viewMy.getStartTime());
		    	System.out.println(viewMy.getstartdate());
		    	System.out.println(viewMy.getEndTime());
		    	System.out.println(viewMy.getenddate());
		    	Result.add(viewMy);
		    }
		    con.close();
//		    return rs;
		} catch (Exception e) {
			System.out.println(e);
		}
		return Result;
		}
}
