package data;


import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javafx.scene.input.Mnemonic;
import model.ManagerModel;
import java.util.Date;



public class transactionDAO {
    
	static PreparedStatement ps;
	public int isBlackListed(String uname){
		int status = 0;
		String query="select BlackListed from test.user where username = ?;";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
				      "jdbc:mysql://localhost:3306/dbtest","root","");  
			ps=con.prepareStatement(query);
		 
			ps.setString(1, uname);
		    ResultSet rs1 = ps.executeQuery();
		    rs1.next();
		    
		    if(rs1.getString(1).equalsIgnoreCase("YES")){
		    	status = 1 ;
		    	
		    }
		    con.close();
		    
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return status;
	}
	public ArrayList searchcar(String startdate , String enddate , String starttime , String endtime , String capacity){
	   	 int status = 0 ;
	   	// String query="select * from reservedcars where startdate>=CAST(? AS DATE) and enddate<=CAST(? as DATE);";
	 	String query = " select cars.CarName from cars where capacity > ? and cars.CarName NOT IN (select CarName from dbtest.reservedcars where Startdate >= ? and EndDate <= ? and Starttime >= ? and EndTime <= ?)" ;
	   		ArrayList<String> mm = null ;
	   		System.out.println("IN DAO");
	   		try {
	   			System.out.println(startdate + " " + enddate + " " + starttime + " " + endtime + " " + capacity);
	   			Class.forName("com.mysql.jdbc.Driver");  
	   			Connection con=DriverManager.getConnection(  
	   				      "jdbc:mysql://localhost:3306/dbtest","root","");  
	   			PreparedStatement ps;
	   			ps=con.prepareStatement(query);
	   		  
	   		    ps.setString(1, capacity);
	   		    ps.setString(2, startdate);
	   		    ps.setString(3, enddate);
	   		    ps.setString(4, starttime);
	   		    ps.setString(5, endtime);
	   		    
	   		    ResultSet rs1 = ps.executeQuery();
	   		    
	   		    mm = new ArrayList<>();
	   		    while(rs1.next()) {
	   		    	System.out.println(rs1.getString(1));
	   		    	mm.add(rs1.getString(1));	

	   		    }
	   		    con.close();
	   		    
	   		} catch (Exception e) {
	   			System.out.println(e);
	   		}
	   		return mm;
	   	 }
	
	public int searchdates(String startdate,String enddate) throws ParseException 
	{
		int a;
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date d1= sd.parse(startdate);
		java.util.Date d2= sd.parse(enddate);
		System.out.println("Start date is "+d1);
		System.out.println("end date is"+d2);
		if(d2.after(d1))
		{
			a=0;
		}
		
		else
		{
			a=1;
		}
	  
	 return a;
	}
	
	public int searchtime(String stdate,String enddate,String sttime,String endtime) throws ParseException
	{int b=0;
	SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
	java.util.Date d1= sd.parse(stdate);
	java.util.Date d2= sd.parse(enddate);
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	java.util.Date d3= sd.parse(sttime);
	java.util.Date d4= sd.parse(endtime);
	if(d1.equals(d2))
	{
		if(d4.before(d3))
		{
			b=1;
		}
		else
		{
			b=0;
		}
		
	}
	
	else
	{
		b=0;
	}
	System.out.println("Start date is "+d1);
	System.out.println("end date is"+d2);
	System.out.println("starttime is"+d3);
	System.out.println("endtime is "+d4);
	return b;
	}
	
	
	public boolean bookcar( String CarName , String Username ,String starttime, String startdate , String endtime ,String enddate){
		String query="INSERT INTO reservedcars(CarName,Username,Starttime,Startdate,Endtime,EndDate,Active) VALUES(?,?,?,?,?,?,?)";
		boolean status  = false ;;
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
				      "jdbc:mysql://localhost:3306/dbtest","root","");  
			ps=con.prepareStatement(query);
		    ps.setString(1, CarName);
		    ps.setString(2, Username);
		    ps.setString(3, starttime);
		    ps.setString(4, startdate);
		    ps.setString(5, endtime);
		    ps.setString(6, enddate);
		    ps.setString(7, "YES");
		    status = ps.execute();

		    con.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		return status;
	}
	
	

}
