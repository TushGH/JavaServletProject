package data;

import java.awt.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import model.AvailableCars;

public class SearchCarDAO {
	static Connection con;
	static PreparedStatement ps,ps1;
	
	int n;
	int m1,m2,m3,m4,y1,y2,y3,y4,d1,d2,d3,d4;
     int h1,h2,h3,h4,min1,min2,min3,min4; 	
   
	public ArrayList<AvailableCars> searchcar(String stime,String etime,String sdate,String edate,String passenger)
	{
		ArrayList<AvailableCars> result=new ArrayList<>();
		System.out.println("hi");
		String query1 = "SELECT c.CarName,c.capacity FROM cars c";//reservedcars s LEFT JOIN reservedcars s ON c.carname = s.carname WHERE (s.carname is null) ";
	     String query2="SELECT s.CarName,s.startdate,s.enddate,s.starttime,s.endtime from reservedcars s";
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			   Connection con=DriverManager.getConnection(  
			      "jdbc:mysql://localhost:3306/sakila","root","Prasi_1995");  
	    	  ps=con.prepareStatement(query1);
	          ps1=con.prepareStatement(query2);   	   
	    	 ResultSet rs = ps.executeQuery();
	    	 ResultSet rs1 = ps1.executeQuery();
	    			 
	    	 System.out.println(rs);
	        System.out.println("gg");
	        
	       if(!rs1.next())
	       {
	    	   while(rs.next())
	    	   {AvailableCars  a = new AvailableCars();
	    	    
	    		  a.setCarName(rs.getString("c.CarName"));
	    		  a.setCapacity(rs.getString("c.capacity"));
	    		  System.out.println("the capacity is"+a.getCapacity());
	    		  if(passenger.equals(a.getCapacity()))
	    		  {System.out.println("the car names are:" + a.getCarName());
	    			  result.add(a);
	    		  } 
	    		   
	    		   
	    	   }
	    	   
	       }
	        
	        
	       else
	       {
	    	 while(rs.next()||rs1.next() )
	    	 {    System.out.println("bye");
	    	 AvailableCars  a = new AvailableCars();
	    	    System.out.println(rs.getString("c.CarName"));
	    		  a.setCarName(rs.getString("c.CarName"));
	    		  a.setCapacity(rs.getString("c.capacity"));
	    		  a.setStartDate(rs1.getString("s.startdate"));
	    		  a.setEndDate(rs1.getString("s.enddate"));
	    		  a.setStarttime(rs1.getString("s.starttime"));
	    		  a.setEndtime(rs1.getString("s.endtime"));
	    		  System.out.println("dota 2");
	    		 
	    		  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    		  Date d1=(Date) sdf.parse(sdate);
	    		  Date d2 = (Date) sdf.parse(edate);
	    		  Date d3= (Date) sdf.parse(a.getStartDate());
	    		  Date d4 = (Date) sdf.parse(a.getEndDate());
	    		 System.out.println("dota 3");
	    		    
	    		    h1= Integer.parseInt(a.getStarttime().substring(0, 2));
	    		    min1=Integer.parseInt(a.getStarttime().substring(3, 5));
	    		    
	    		    h2=Integer.parseInt(a.getEndtime().substring(0, 2));
	    		    min2=Integer.parseInt(a.getEndtime().substring(3, 5));
	    		    
	    		    h3=Integer.parseInt(stime.substring(0, 2));
	    		    m3=Integer.parseInt(stime.substring(3, 5));
	    		    
	    		    h4=Integer.parseInt(etime.substring(0, 2));
	    			m4=Integer.parseInt(etime.substring(3, 5));    
	    		 
	    		System.out.println("hi");	
	    			
	    			if(rs.getString("c.CarName")!=rs1.getString("s.CarName"))
	    			{
	    				
	    				System.out.println("just add the cars"+a.getCarName());
	    				result.add(a);
	    				
	    				
	    			}
	    			
	    			else
	    			{			
	    		if(( (d1.compareTo(d3)<0) && (d2.compareTo(d3)<0)) && (a.getCapacity()==passenger) )	
	    		{   System.out.println("printing the car names of the list:"+a.getCarName());
	    			result.add(a);
	    			
	    		}
	    	
	    		else if(((d1.compareTo(d4)>0)&&(d2.compareTo(d4)>0)) &&((a.getCapacity()==passenger)) )
	    		{
	    			System.out.println("printing the car names of the list: "+a.getCarName());
	    		    result.add(a);
	    		}
	    		
	    		
	    		else if((d1.compareTo(d3)>0)&&(d2.compareTo(d4)>0) && (a.getCapacity()==passenger) )
	    		{
	    			  if(d1.compareTo(d4)>0)
	    			  {
	    				  System.out.println("printing the car names list: "+a.getCarName());
	    				  result.add(a);
	    			  }   
	    			 
	    			  else {
	    				  
	    			  }
	    			
	    		}
	    	  
	    		else if((d1.compareTo(d3)<0)&&(d2.compareTo(d4)<0) && (a.getCapacity()==passenger)) 
	    		
	    		{
	    			if(d2.compareTo(d3)<0)
	    			{
	    				System.out.println("printing the car names list: "+a.getCarName());
	    				  result.add(a);	
	    			}
	    			   
	    			else
	    			{
	    				
	    				
	    			}
	    			
	    		}
	    	 
	    		else 	
	    		{
	    		  
	    			
	    		}
	    	 
	    			}
	    	 }
	    	 
	  
	    	 
	              	 
	    
	    	con.close();
	
	    	
	        	
	    
		
		
		}
	
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	
	return result;
	}
	

}
