package servlettypes;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.NewsDAOImpl;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	PrintWriter out=response.getWriter();
	HttpSession session=request.getSession();
	
	RequestDispatcher requestDispatcher=request.getRequestDispatcher("WelcomeUser.html");
	out.println(session.getAttribute("name"));
	requestDispatcher.include(request, response);
	NewsDAOImpl caller=new NewsDAOImpl();
	RequestDispatcher dispatcher=request.getRequestDispatcher("NewsContent.html");
	dispatcher.include(request, response);
	String type=request.getParameter("group1");
	out.println(type);
			for(String s:caller.getNews(type)){
				out.println(s);
				//out.println("<input type='text'>"+s+"</text>");
			}
			
	out.println("</body>");
	out.println("</head>");
	out.println("</html>");
	}
}
