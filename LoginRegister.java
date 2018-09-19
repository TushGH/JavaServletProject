package loginandregistration;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class LoginRegister
 */
@WebServlet("/loginRegister")
public class LoginRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		userinter ud = new userinterimplement();
		String userName=request.getParameter("username");
		String password=request.getParameter("password");
		String submittype=request.getParameter("submit");
		userconstruct u = ud.getuser(userName, password);
		if(submittype.equals("login") && u!=null && u.getName()!=null)
		{
			request.setAttribute("message", u.getName());
			request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}
		else if(submittype.equals("Register"))
		{
			u.setName(request.getParameter("name"));
			u.setPassword(password);
			u.setUsername(userName);
			ud.insertuser(u);
			request.setAttribute("successMessage","Registration done,please login to continue");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		else {
			
			request.setAttribute("message", "data not found click on register");
			request.getRequestDispatcher("login.jsp").forward(request,response);
		}
				
	}

}
