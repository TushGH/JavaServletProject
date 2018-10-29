package data;

import java.awt.List;


import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import model.AvailableCars;
import java.sql.*;

public class SearchCarDAO {
	static Connection con;
	static PreparedStatement ps,ps1,ps2,ps3;
	
	int n;
	int m1,m2,m3,m4,y1,y2,y3,y4,d1,d2,d3,d4;
     int h1,h2,h3,h4,min1,min2,min3,min4; 	
   
	public ArrayList<AvailableCars> searchcar(String sdate,String edate)
	{
		ArrayList<AvailableCars> result=new ArrayList<AvailableCars>();
		System.out.println("hi");
		String query1 = "SELECT c.CarName,c.capacity FROM cars c";//reservedcars s LEFT JOIN reservedcars s ON c.carname = s.carname WHERE (s.carname is null) ";
	     String query2="SELECT s.CarName,s.Startdate,s.EndDate from reserved_cars s";
		try {
			Class.forName("com.mysql.jdbc.Driver");  
			   Connection con=DriverManager.getConnection(  
			      "jdbc:mysql://localhost:3306/test","root","");  
	    	  ps=con.prepareStatement(query1);
	          ps1=con.prepareStatement(query2);   	   
	    	 ResultSet rs = ps.executeQuery();
	    	 ResultSet rs1 = ps1.executeQuery();
	    			 
//	    	 System.out.println(rs);
//	        System.out.println("gg");
	        
	       if(!rs1.next())
	       {
	    	   while(rs.next())
	    	   {AvailableCars  a = new AvailableCars();
	    	    
	    		  a.setCarName(rs.getString("c.CarName"));
	    		  a.setCapacity(rs.getString("c.capacity"));
	    		  a.setStartDate(sdate);
	    		  a.setEndDate(edate);
	    		 // a.setStarttime(stime);
	    		  //a.setEndtime(etime);
	    		  System.out.println("the capacity is"+a.getCapacity());
	    		 
	    		  System.out.println("the car names are:" + a.getCarName());
	    			  result.add(a);
	    		  } 
	    		   
	    		   
	    	   }
	    	   
	       
	        
	        
	       else
	       {  
	    	  // AvailableCars a = new AvailableCars();
	           int count1=0;
	           ps3=con.prepareStatement(query2);
   	           ResultSet rs3 = ps3.executeQuery();
   	    
	          while(rs3.next())
	          {   System.out.println("the start date received is"+rs1.getString("s.Startdate"));
	    	   count1=count1+1;
	       }
	    //   a.setStartDate(sdate);
 		 // a.setEndDate(edate);
	          
	    	 while(rs.next())
	    		 
	{   
	    		int  count=0;
                   	    		
	    		
	    		 
	    		 System.out.println("bye");
	    	
	    	    System.out.println(rs.getString("c.CarName"));
	    	    System.out.println("the count of rs1 is "+count1);
	    	    ps2=con.prepareStatement(query2);
	    	    ResultSet rs2 = ps2.executeQuery();
	    	    rs2.next();
	    	    System.out.println("the start date received from result  set 2 is"+rs2.getString("s.Startdate"));
	    	    System.out.println("the count of rs11 is "+count1);
	    		//  a.setCarName(rs.getString("c.CarName"));
	    		//  a.setCapacity(rs.getString("c.capacity"));
	    		 
	    		  //a.setStarttime(stime);
	    		  //a.setEndtime(etime);
	    		  //System.out.println("dota 2");
	    		  System.out.println("the count of rs111 is "+count1);
	    	   
	    		 for(int i=0;i<count1;i++)
	    			 
	    { 
	    		 
	    		// System.out.println("In for in the function1");
	    		  SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    		  System.out.println("In for in the function2");
	    		  Date d1= sdf.parse(sdate);
	    		  System.out.println("the start date received from result  set 2 again is"+rs2.getString("s.Startdate"));
	    		  System.out.println("In for in the function3");
	    		  Date d2 =  sdf.parse(edate);
	    		  System.out.println("In for in the function3 for the last time");
	    		 // date1=rs2.getString("s.Startdate");
	    		//  System.out.println("In for in the function4");
	    			//date2=rs2.getString("s.EndDate");
	    			//System.out.println("In for in the function4");
	    			Date d3= sdf.parse(rs2.getString("s.Startdate"));
	    		//	System.out.println("In for in the function4");
		    		  Date d4 =  sdf.parse(rs2.getString("s.EndDate"));
		    //		  System.out.println("In for in the function5");
	    	//		System.out.println("In for in the function4 all");
		    		// SimpleDateFormat tdf = new SimpleDateFormat("HH:mm");
		    		 //String time1=rs2.getString("s.Starttime");
		    		 //String time2=rs2.getString("s.Endtime");
		    		 
		    		 
		    		 //Date t1=(Date)tdf.parse(stime);
		    		 //Date t2=(Date)tdf.parse(etime);
		    		 //Date t3=(Date)tdf.parse(time1);
		    		 //Date t4=(Date)tdf.parse(time2);
		    		 
		    		
		    		 //System.out.println("the time of our input"+t1);
	    		   // h1= Integer.parseInt(a.getStarttime().substring(0, 2));
	    		    //min1=Integer.parseInt(a.getStarttime().substring(3, 5));
	    		    
	    		   // h2=Integer.parseInt(a.getEndtime().substring(0, 2));
	    		    //min2=Integer.parseInt(a.getEndtime().substring(3, 5));
	    		    
	    		    //h3=Integer.parseInt(stime.substring(0, 2));
	    		    //m3=Integer.parseInt(stime.substring(3, 5));
	    		    
	    		    //h4=Integer.parseInt(etime.substring(0, 2));
	    			//m4=Integer.parseInt(etime.substring(3, 5));    
	    		
		    		  System.out.println("the carname here is "+rs.getString("c.CarName"));
	    		System.out.println("hi");	
	    			
	    			if(d3.after(d1)&&d3.after(d2))
	    			{
	    				System.out.println("in d3");
	    				
	    				count=count+1;
	    				
	    			}
	    			
	    			else if(d1.after(d4))
	    			{			
	    				System.out.println("in d1");
	    			   count=count+1;
	    			
	    			}
	    			
	    			
	    			else if(!(rs.getString("c.CarName").equals(rs2.getString("s.CarName"))))
	    					{
	    				    
	    				   count=count+1;
	    					}
	    			//else if(d1.equals(d4)) 
	    			//{  
	    				//if(t1.after(t4))
	    				//{
	    					
	    				//	count=count+1;
	    				//}
	    				
	    				
	    				
	    		//	}
	    		 
	    			//else if(d2.equals(d3))
	    			//{
	    				//if(t3.after(t2))
	    				//{
	    					
	    				//	count=count+1;
	    				//}
	    				
	    		//	}
	    			
	    			else
	    			{   
	    				System.out.println("DOnt add the cars");
	    				
	    			}
	    		 rs2.next();
	    		 
	      }
	    	  if(count>=1)
	    	  {  System.out.println("the count of the cars is"+count);
	    		AvailableCars a = new AvailableCars();
	    		a.setCapacity(rs.getString("c.capacity"));
	    	   a.setCarName(rs.getString("c.CarName"));
	    	   a.setStartDate(sdate);
	    		  System.out.println("the car name in count is " + rs.getString("c.CarName"));
	    		  result.add(a);
	    		  
	    		  
	    	  }
               
	    	  else
	    	  
	    	  {System.out.println("the count in else  is "+count);
	    		  
	    	  }
	    	  
	    			
	    }	
	  }
	       
  }
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	
	return result;
	}
	

}
