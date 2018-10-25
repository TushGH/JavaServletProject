package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.SearchCarDAO;
import model.AvailableCars;
import model.ManagerModel;

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
			// starttime = request.getParameter("starttime");
			//String endtime=request.getParameter("endtime");
			
		
		SearchCarDAO sc = new SearchCarDAO();
		ArrayList<AvailableCars> avail = new ArrayList<AvailableCars>();
		avail=sc.searchcar(startdate, enddate);
		System.out.println("I am printing cars");
	    //
		
		 // PrintWriter out = response.getWriter();
	      //out.println("<head>");
	      //out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"test.css\" media=\"screen\" />");
	      //out.println("</head>");
	      //out.println("<img src=\"car4.png\" alt=\"car img\" height=\"100\" width=\"100\">");
	      //out.println("<h1> Available car <h1>");
	      
		//for(int i=0;i<avail.size();i++)
		//{
	     // out.println("the available cars are");
	      //out.println(avail.get(i).getCarName());
			
		//}
		System.out.println("the available cars are");
		for(int i=0;i<avail.size();i++)
		{
			System.out.println(avail.get(i).getCarName());
			
		}
		
		request.setAttribute("caravail", avail);
		 request.getRequestDispatcher("ReserveCar.jsp").forward(request, response);
		
			
		}
	
	}

}
