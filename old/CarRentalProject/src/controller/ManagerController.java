package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.ManagerDAO;


/**
 * Servlet implementation class ManagerController
 */
@WebServlet("/ManagerController")
public class ManagerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManagerController() {
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
		// TODO Auto-generated method stub
		String sub=request.getParameter("submit");
		ManagerDAO user=new ManagerDAO();
		if(sub.equalsIgnoreCase("ViewAllCarsRented")) {
		String startdate = request.getParameter("startdate");
		String enddate = request.getParameter("enddate");
		System.out.println(startdate+ " " + enddate + " " );
		user.ViewAllCarsRented(startdate, enddate);
		doGet(request, response);
	}
		else if(sub.equalsIgnoreCase("ViewDetails")) {
			String reservationid = request.getParameter("confirmationid");
			System.out.println(reservationid+ " ");
			ManagerDAO result=new ManagerDAO();
			result.ViewSpecificRental(reservationid);
		}
		else if(sub.equalsIgnoreCase("AddCar")) {
			String CarName=request.getParameter("CarName");
			String Capacity=request.getParameter("Capacity");
			String WeekDay=request.getParameter("WeekDay");
			String WeekEnd=request.getParameter("WeekEnd");
			String Week=request.getParameter("Week");
			String Gps=request.getParameter("Gps");
			String OnStar=request.getParameter("OnStar");
			String SiriusXM=request.getParameter("SiriusXM");
			ManagerDAO add=new ManagerDAO();
			add.AddCar(CarName,Capacity,WeekDay,WeekEnd,Week,Gps,OnStar,SiriusXM);
		
		}
		else if(sub.equalsIgnoreCase("DeleteRental")) {
		String reservationid = request.getParameter("confirmationid");
		System.out.println(reservationid+ " ");
		ManagerDAO result=new ManagerDAO();
		result.delete(reservationid);
		}
		
		else if(sub.equalsIgnoreCase("UpdateProfile")) {
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
				System.out.println(session.getAttribute("username"));
				ManagerDAO update=new ManagerDAO();
				update.UpdateManager(name, email, phone, addr, newpassword, (String)session.getAttribute("username"));
				session.invalidate();
			
		}
		
	}

}
