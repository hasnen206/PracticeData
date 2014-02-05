package servlettypes;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InvalidUser
 */
public class InvalidUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doCommon(request, response);	
	}
protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.println("Wrong User");
		out.println("<html>");
		out.println("<head>");
		out.println("<body>");
		out.println("<a href='Login.html'>Login</a>");
		
		out.println("</body>");
		out.println("</head>");
		out.println("</html>");
		
	}
	
}
