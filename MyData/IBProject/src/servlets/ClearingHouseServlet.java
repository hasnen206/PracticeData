package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ordermgmt.CurrentPosition;


public class ClearingHouseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CurrentPosition position=new CurrentPosition();
		position.calcPostCurrentPosition();
		PrintWriter out=response.getWriter();
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp_pages/Processed.jsp");
		dispatcher.include(request, response);
		out.println("<br>");
		out.println("<br>");
		out.println("<a href='/IBProject/jsp_pages/Welcome.jsp'>LogOut</a>");
	}
}
