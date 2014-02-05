package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOImpl;

public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("uname");
		String password=request.getParameter("password");
		DAOImpl impl=new DAOImpl();
		String type=impl.getUser(uname, password);
		RequestDispatcher dispatcher;
		if(type.equals("VALID")){
			dispatcher=request.getRequestDispatcher("/jsp/Welcome.jsp");
			dispatcher.forward(request, response);
			
		}
		else if(type.equalsIgnoreCase("INVALID")){
			request.setAttribute("uname",uname);
			dispatcher=request.getRequestDispatcher("/jsp/Invalid.jsp");
			dispatcher.forward(request, response);
			
		}
	}
}
