package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.SearchCarDAO;
import model.AvailableCars;

/**
 * Servlet implementation class SearchcarControl
 */
@WebServlet("/SearchcarControl")
public class SearchcarControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchcarControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sub=request.getParameter("submit");
		System.out.println(sub);
		
		if(sub.equalsIgnoreCase("searchcar"))
		{
			String startdate = request.getParameter("startdate");
			String enddate=request.getParameter("enddate");
			String starttime = request.getParameter("starttime");
			String endtime=request.getParameter("endtime");
			
		String passengers=	request.getParameter("passengers");
		SearchCarDAO sc = new SearchCarDAO();
		ArrayList<AvailableCars> avail = new ArrayList<AvailableCars>();
		avail=sc.searchcar(startdate, enddate, starttime, endtime, passengers);
		System.out.println("I am printing cars");
	
		for(int i=0;i<avail.size();i++)
		{
			System.out.println("the car name in controller is"+avail.get(i).getCarName());
			
		}
		request.setAttribute("availablecars", avail);
		getServletContext().getRequestDispatcher("/ReserveCar.jsp").forward(request, response);
		
			
		}
	
	}

}