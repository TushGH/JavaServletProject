package controller;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.transactionDAO;



/**
 * Servlet implementation class SearchFunction
 */
@WebServlet("/SearchFunction")
public class SearchFunction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
	
    public SearchFunction() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sub=request.getParameter("submit");
		System.out.println(sub);
		if(sub.equalsIgnoreCase("Search")){
			String startdate = request.getParameter("startdate");
			String enddate = request.getParameter("enddate");
			String starttime = request.getParameter("starttime");
			String endtime =request.getParameter("endtime");
			String capacity =request.getParameter("capacity");
			System.out.println(startdate + " " + enddate + " " + starttime + " " + endtime + " " + capacity);
			transactionDAO aa = new transactionDAO();
			ArrayList<String> availableCar = aa.searchcar(startdate, enddate, starttime, endtime, capacity);
			request.setAttribute("startdate", startdate);
			request.setAttribute("enddate", enddate);
			request.setAttribute("starttime", starttime);
			request.setAttribute("endtime", endtime);
			request.setAttribute("capacity", capacity);
			request.setAttribute("list", availableCar);
			request.getRequestDispatcher("Display.jsp").forward(request, response);
			
		}
		if(sub.equalsIgnoreCase("BookMyCar")){
			String startdate = request.getParameter("startdaten");
			String enddate = request.getParameter("enddaten");
			String starttime = request.getParameter("starttimen");
			String endtime =request.getParameter("endtimen");
			String capacity =request.getParameter("capacityn");
			String CarName = request.getParameter("database1");
			String Username = rentalcontrol.g_uname;
			System.out.println("Global username is "+Username);
			System.out.println(startdate + " " + enddate + " " + starttime + " " + endtime + " " + capacity + " " + CarName);
			transactionDAO aa = new transactionDAO();
			int a = aa.isBlackListed(Username) ;
			System.out.println("The value og a is " + a );
			if(a==1){
				request.setAttribute("errorMsg", "You are blacklisted Please contact admin");
				request.getRequestDispatcher("Display.jsp").forward(request, response);
				
			}
			else{
			
			boolean status = aa.bookcar(CarName, Username, starttime, startdate, endtime, enddate);
			System.out.println(status);
			System.out.println("going to Booking Info");
			request.setAttribute("startdate", startdate);
			request.setAttribute("enddate", enddate);
			request.setAttribute("starttime", starttime);
			request.setAttribute("endtime", endtime);
			request.setAttribute("capacity", capacity);
			request.setAttribute("CarName", CarName);
			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
			
			java.util.Date date1 = null;
			java.util.Date date2 = null;
			try {
				date1 = format.parse ( startdate );
				date2 = format.parse ( enddate );
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			double price = aa.calPrice(date1, date2,CarName);
			request.setAttribute("price", price);
			
			request.getRequestDispatcher("BookingInfo.jsp").forward(request, response);
			}
		}
	}

}
