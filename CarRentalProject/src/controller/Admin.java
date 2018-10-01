package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.UserDAO;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/Admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin() {
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
		
		if(sub.equalsIgnoreCase("revoke")){
			System.out.println("The to be revoked user is " + request.getParameter("username"));
			UserDAO user = new UserDAO();
			int status = user.revoke(request.getParameter("username"));
			System.out.println(status);
			request.getRequestDispatcher("AdminHomePage.jsp").forward(request, response);
		}
		if(sub.equalsIgnoreCase("editrole")){
			System.out.println("The to be revoked user is " + request.getParameter("username"));
			UserDAO user = new UserDAO();
			int status = user.editrole(request.getParameter("username"),request.getParameter("role"));
			System.out.println(status);
			request.getRequestDispatcher("AdminHomePage.jsp").forward(request, response);
			
			
			
		}
	}

}
