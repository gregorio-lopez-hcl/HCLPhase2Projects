package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import util.HibUtil;
import util.UserProfile;
import util.VerifyUser;



/**
 * Servlet implementation class UAuth
 */

public class UAuth extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UAuth() {
    	super(); 
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 request.getRequestDispatcher("ulogin.jsp").forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			verify2(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
		
	private void verify2(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String uname = request.getParameter("name");
		String pass = request.getParameter("password"); 
		
		if (VerifyUser.verify(uname, pass)) {
		
			System.out.println("Successfully Logged In!");
			request.getRequestDispatcher("logsuccess.jsp").forward(request, response); 
			} else { 
			System.out.println("Failed to Login!");
			request.getRequestDispatcher("logfail.jsp").forward(request, response); 
			}
		
		}
		
	

}
