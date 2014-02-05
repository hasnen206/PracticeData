package loginservlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.channels.SeekableByteChannel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserDAOImpl;


public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String password=request.getParameter("pass");
		UserDAOImpl impl=new UserDAOImpl();
		String checkuser=impl.getUserType(name, password);
		PrintWriter out=response.getWriter();
		HttpSession session=request.getSession();
		session.setAttribute("name",name);
		//requestdispatcher is an interface
		RequestDispatcher requestDispatcher=null;
		if(checkuser.equals("USER"))
		{
			requestDispatcher=request.getRequestDispatcher("/jsp/Admin.jsp");
			
		}
		else  if(checkuser.equals("ADMIN")){
			requestDispatcher=request.getRequestDispatcher("/admin");
		}
		else if(checkuser.equals("INVALIDUSER")){
			requestDispatcher=request.getRequestDispatcher("/Invalid");
		}
		requestDispatcher.forward(request, response);
		
	}

}
