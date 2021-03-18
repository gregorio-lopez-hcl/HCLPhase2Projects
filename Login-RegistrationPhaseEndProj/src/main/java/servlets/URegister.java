package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.RegisterUser;
import util.UserProfile;

/**
 * Servlet implementation class UserRegister
 */

public class URegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
   * @see HttpServlet#HttpServlet()
     */
    public URegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
     request.getRequestDispatcher("ureg.jsp").forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		{
			
			UserProfile newuser = new UserProfile();
			RegisterUser regnu = new RegisterUser();
			newuser.setID(Integer.parseInt(request.getParameter("id")));
			newuser.setName(request.getParameter("name"));
			newuser.setEmail(request.getParameter("email"));
			newuser.setPassword(request.getParameter("password"));
			
			if (regnu.update(newuser)) {
				
				System.out.println("Successfully Created a new user profile!");
				request.getRequestDispatcher("regsuccess.jsp").forward(request, response);
			} else {
				System.out.println("Failed to create a new user profile.");
				request.getRequestDispatcher("regfail.jsp").forward(request, response);
			}
			
		}
	}

}

