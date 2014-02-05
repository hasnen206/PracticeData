<%@page import="pojo.SellOrder"%>
<%@page import="pojo.BuyOrder"%>
<%@page import="java.util.ArrayList"%>
<%@page import="ordermgmt.CurrentPosition"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
body
{
background-color:#F4A460;
}
h1
{
color:orange;
text-align:center;
}
p
{
font-family:"Times New Roman";
font-size:20px;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Done Trades</title>
</head>
<body>
<h3>Buy Details</h3>
<table border="2">
<%CurrentPosition position=new CurrentPosition();
ArrayList<BuyOrder> buyOrders=new ArrayList<BuyOrder>();
buyOrders=position.getBuyOrderList();%>
<tr><td>BrokerId</td><td>Security Name</td><td>Rate</td><td>Quantity</td><td>Direction</td></tr>
<%for(BuyOrder buyOrder:buyOrders){ %>
<tr><td><%=buyOrder.getBrokerId()%></td><td><%=buyOrder.getSecName()%></td><td><%=buyOrder.getRate()%></td><td><%=buyOrder.getQuantity()%></td><td><%=buyOrder.getDirection()%></td></tr>
<%}; %>
</table>
<br>
<h3>Sell Details</h3>
<table border="2">
<%
ArrayList<SellOrder> sellOrders=new ArrayList<SellOrder>();
sellOrders=position.getSellOrderList();%>
<tr><td>BrokerId</td><td>Security Name</td><td>Rate</td><td>Quantity</td><td>Direction</td></tr>
<%for(SellOrder sellOrder:sellOrders){ %>
<tr><td><%=sellOrder.getBrokerId()%></td><td><%=sellOrder.getSecName()%></td><td><%=sellOrder.getRate()%></td><td><%=sellOrder.getQuantity()%></td><td><%=sellOrder.getDirection()%></td></tr>
<%}; %>
</table>
<br>
<center><a href="Welcome.jsp">LogOut</a></center>

</body>
</html>