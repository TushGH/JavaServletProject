package controller;

import java.io.IOException;
import java.sql.PreparedStatement;
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
			System.out.println(Username);
			System.out.println(startdate + " " + enddate + " " + starttime + " " + endtime + " " + capacity + " " + CarName);
			transactionDAO aa = new transactionDAO();
			boolean status = aa.bookcar(CarName, Username, starttime, startdate, endtime, enddate);
			System.out.println(status);
			
			
		}
	}

}
