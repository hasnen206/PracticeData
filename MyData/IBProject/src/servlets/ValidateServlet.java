package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ordermgmt.OrderManagment;

import pojo.Broker;


public class ValidateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
   
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}
protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username=request.getParameter("uname");
		RequestDispatcher dispatcher=null;
		String id=request.getParameter("password");
		int brokerId=Integer.parseInt(id);
		HttpSession session=request.getSession(true);
		session.setAttribute("id", brokerId);
		OrderManagment managment=new OrderManagment();
		ArrayList<Broker> brokerslist=new ArrayList<Broker>();
		brokerslist=managment.getBrokerList();
		for(Broker broker:brokerslist ){
			
		
		if(username.equals(broker.getBrokerName())){
			dispatcher=request.getRequestDispatcher("/jsp_pages/Order.jsp");
			dispatcher.forward(request, response);
			return;
		}
		
	}
		for(Broker broker:brokerslist ){
		 if(!username.equals(broker.getBrokerName())){
			dispatcher=request.getRequestDispatcher("/jsp_pages/Register.jsp");
			dispatcher.forward(request, response);
		}
			
	}
}

}
