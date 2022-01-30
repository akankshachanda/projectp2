package java.programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
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

		public void doPost(HttpServletRequest request, HttpServletResponse response)
			     throws ServletException,IOException{
			      response.setContentType("text/html");
			      String email = request.getParameter("email");
			      String password = request.getParameter("password");
			      RequestDispatcher rd = null;
			      if(email.equalsIgnoreCase("akanksha") &&
			      password.equals("akanksha@123")) {
			      rd=request.getRequestDispatcher("SuccessServlet");
			      rd.forward(request, response);
			      }
			      else {
			    	  rd= request.getRequestDispatcher("index.html");
			    	  PrintWriter out=response.getWriter();
			    	  rd.include(request, response);
	 out.print("<center> <span style = 'color:red'>In credentials!!</span> </center>");
			    	  }
			    	  }

			      
			     
		
	}


