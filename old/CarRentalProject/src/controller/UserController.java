package controller;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import data.CancelReservationDAO;
import data.UpdateDao;
import data.ViewMyReservationDAO;

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

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
			System.out.println(session.getAttribute("username"));
			UpdateDao update=new UpdateDao();
			update.UpdateDao1(name, email, phone, addr, newpassword, (String)session.getAttribute("username"));
			session.invalidate();
		}
		else if(sub.equalsIgnoreCase("ViewMyReservation")) {
			String startdate = request.getParameter("startdate");
			String enddate = request.getParameter("enddate");
			System.out.println(startdate+ " " + enddate + " " );
			ViewMyReservationDAO result=new ViewMyReservationDAO();
			result.ViewReservation(startdate, enddate);
		}
		else if(sub.equalsIgnoreCase("CancelReservation")) {
			String confirmationid = request.getParameter("confirmationid");
			String UTAID = request.getParameter("UTAID");
			System.out.println(confirmationid+ " " + UTAID + " " );
			CancelReservationDAO can=new CancelReservationDAO();
			can.Cancel(confirmationid);
			//request.getRequestDispatcher("CancelReservation.jsp").forward(request, response);	
		}
		doGet(request, response);
	}

}
