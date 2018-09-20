package controller;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.UserDAO;
import model.user;

/**
 * Servlet implementation class rentalcontrol
 */
@WebServlet("/rentalcontrol")
public class rentalcontrol extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public rentalcontrol() {
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
		if(sub.equalsIgnoreCase("login"))
		{
			System.out.println("LOGIN");
		}
		else if(sub.equalsIgnoreCase("Register"))
		{   System.out.println("In Register");
			user newuser = new user();
			newuser.setFullName(request.getParameter("name"));
			
			newuser.setPassword(request.getParameter("password"));
		    
			newuser.setUsername(request.getParameter("user_name"));
			
			UserDAO InsertUser = new UserDAO();
			int status = InsertUser.insertuser(newuser);
			System.out.println(status);
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
		else {
			
			
		}
	}

}
