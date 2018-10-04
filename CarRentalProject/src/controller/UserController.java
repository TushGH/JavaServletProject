package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import data.CancelReservationDAO;
import data.ManagerDAO;
import data.UpdateDao;
import data.UserDAO;
import data.ViewMyReservationDAO;
import model.ManagerModel;
import model.user;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
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

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sub=request.getParameter("submit");
		if(sub.equalsIgnoreCase("UpdateProfile")) {
			HttpSession session = request.getSession();
			String username=request.getParameter("username");
			session.setAttribute("username",username);
			String name=request.getParameter("name");
			String email=request.getParameter("email");
			String phone=request.getParameter("phone");
			String addr=request.getParameter("addr");
			String curpassword=request.getParameter("curpassword");
			String newpassword=request.getParameter("newpassword");
			String conpassword=request.getParameter("conpassword");
			//System.out.println(session.getAttribute("username"));
			ManagerDAO update=new ManagerDAO();
			update.UpdateManager(name, email, phone, addr, newpassword, username);
			request.getRequestDispatcher("UserHomePage.jsp").forward(request, response);
			session.invalidate();
		}
		else if(sub.equalsIgnoreCase("ViewMyReservation")) {
			ManagerDAO user=new ManagerDAO();
			String startdate = request.getParameter("startdate");
			String enddate = request.getParameter("enddate");
			System.out.println(startdate+ " " + enddate + " " );
			ArrayList<ManagerModel> mm =    user.ViewAllCarsRented(startdate, enddate);
			response.setContentType("text/html");
            
		     
		      PrintWriter out = response.getWriter();
		      out.println("<head>");
		      out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"test.css\" media=\"screen\" />");
		      out.println("</head>");
		      out.println("<img src=\"car4.png\" alt=\"car img\" height=\"100\" width=\"100\">");
		      out.println("<h1> List Of Reservations  <h1>");
		      for (ManagerModel a : mm){
		    	  out.println( a.getCarName() + "   " + a.getReservationid() );  
		    	  out.println( " Start Time "+ a.getStartTime() + " StartDate  " + a.getstartdate() );  
		    	  out.println( " END Time "+ a.getEndTime() + "END Date  " + a.getenddate() );  
		        
		      
		      }
			doGet(request, response);
		}
		else if(sub.equalsIgnoreCase("CancelReservation")) {
			String reservationid = request.getParameter("confirmationid");
			System.out.println(reservationid+ " ");
			ManagerDAO result=new ManagerDAO();
			result.delete(reservationid);
			request.getRequestDispatcher("UserHomePage.jsp").forward(request, response);
		}
		doGet(request, response);
	}

}
