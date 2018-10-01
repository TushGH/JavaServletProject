package data;
import model.ViewMyReservation;
import java.util.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViewMyReservationDAO {
	
	static Connection con;
	static PreparedStatement ps;
	public List<ViewMyReservation> ViewReservation(String startdate,String enddate){
		ViewMyReservation viewMy=null;
		List<ViewMyReservation> Result=new ArrayList<>();
	String query="select Reservationid,CarName,StartTime,StartDate,EndTime,EndDate from reservedcars where startdate=? and enddate=?";
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
//	    return rs;
	} catch (Exception e) {
		System.out.println(e);
	}
	return Result;
	}
}
