package java.programs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.programs.LoginDao;

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
			      PrintWriter out = response.getWriter();

			      String name = request.getParameter("userName");
			      String password = request.getParameter("userPassword");
			      
			     if(LoginDao.validate(name,password)){
			    	 RequestDispatcher rd = request.getRequestDispatcher("Servlet2");
			    	 rd.forward(request, response);
			     }
			     else{
			    	 out.print("sprry username or password is error ");
			    	 RequestDispatcher rd = request.getRequestDispatcher("index.html");
			    	 rd.include(request, response);
			     }
			      
			    
			     }
		
	}


