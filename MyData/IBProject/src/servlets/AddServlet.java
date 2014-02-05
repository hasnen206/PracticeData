package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ordermgmt.OrderManagment;
import pojo.Broker;


public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}
	
protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp_pages/Register.jsp");	
	dispatcher.include(request, response);
	OrderManagment managment=new OrderManagment();
		String username=request.getParameter("uname");
		String id=request.getParameter("password");
		int brokerId=Integer.parseInt(id);
		//String brokerage=request.getParameter("bokerage");
		//double brokerage1=Double.parseDouble(brokerage);
		Broker broker=new Broker(brokerId, username,10);
		managment.addBroker(broker);
		PrintWriter out=response.getWriter();
		out.println("You Are Now Registered");
		ArrayList<Broker> brokers=new ArrayList<Broker>();
		brokers=managment.getBrokerList();
		for(Broker broker2:brokers){
			System.out.println(broker2);
			}
		out.println("<a href='/IBProject/jsp_pages/Welcome.jsp'>Go Back</a>");
		return;
	}

}
