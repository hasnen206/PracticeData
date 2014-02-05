package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ordermgmt.OldRecords;
import ordermgmt.OrderManagment;
import pojo.BuyOrder;
import pojo.OldBuyOrder;
import pojo.OldSellOrder;
import pojo.SellOrder;


public class AddOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doCommon(request, response);
	}

	protected void doCommon(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		OldRecords records=new OldRecords();
		PrintWriter out=response.getWriter();
		OrderManagment managment=new OrderManagment();
		String id=request.getParameter("brokerid");
		int brokerId=Integer.parseInt(id);
		String security=request.getParameter("security");
		String rate=request.getParameter("rate");
		double rates=Double.parseDouble(rate);
		String quantity=request.getParameter("quantity");
		long quantities=Long.parseLong(quantity);
		String direction=request.getParameter("direction");
		if(direction.equals("BUY")){
			OldBuyOrder oldBuyOrder=new OldBuyOrder(brokerId, security, rates, quantities, direction);
			records.addOldBuyOrder(oldBuyOrder);
			BuyOrder buyOrder=new BuyOrder(brokerId, security, rates, quantities, direction);
			managment.addBuyOrder(buyOrder);
			ArrayList<BuyOrder> buyOrders=new ArrayList<BuyOrder>();
			buyOrders=managment.getBuyOrderList();
			for(BuyOrder order:buyOrders){
				System.out.println(order);
			}
			RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp_pages/Order.jsp");
			dispatcher.include(request, response);
		}
		else{
			OldSellOrder oldSellOrder=new OldSellOrder(brokerId, security, rates, quantities, direction);
			records.addOldSellOrder(oldSellOrder);
			SellOrder sellOrder=new SellOrder(brokerId, security, rates, quantities, direction);
			managment.addSellOrder(sellOrder);
			ArrayList<SellOrder> sellOrders=new ArrayList<SellOrder>();
			sellOrders=managment.getSellOrderList();
			for(SellOrder order:sellOrders){
				System.out.println(order);
			}
			RequestDispatcher dispatcher=request.getRequestDispatcher("/jsp_pages/Order.jsp");
			dispatcher.include(request, response);
		}
		out.println("<form action='/IBProject/jsp_pages/BrokerDetails.jsp' method='post'>");
		out.println("<input type='submit' value='Trade History'>");
		out.println("</form>");
		out.println("<br>");
		out.println("<br>");
		out.println("<form action='/IBProject/jsp_pages/BrokerDetails2.jsp' method='post'>");
		out.println("<input type='submit' value='Done Trades'>");
		out.println("</form>");
		out.println("<br>");
		out.println("<br>");
		out.println("<br>");
		out.println("<br>");
		out.println("<form action='/IBProject/jsp_pages/BrokerPosition.jsp' method='post'>");
		out.println("<input type='submit' value='Payable/Receivable'>");
		out.println("</form>");
		out.println("<br>");
		out.println("<br>");
		out.println("<a href='/IBProject/jsp_pages/Welcome.jsp'>LogOut</a>");
		//response.setIntHeader("AddOrderServlet",5);
	}

}
