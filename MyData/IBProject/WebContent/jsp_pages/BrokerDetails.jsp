<%@page import="pojo.OldSellOrder"%>
<%@page import="pojo.OldBuyOrder"%>
<%@page import="ordermgmt.OldRecords"%>
<%@page import="pojo.SellOrder"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pojo.BuyOrder"%>
<%@page import="ordermgmt.OrderManagment"%>
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
<title>All Trade Details</title>
</head>
<body>
<h3>Buy Details</h3>
<table border="2">
<%OldRecords records=new OldRecords();
ArrayList<OldBuyOrder> buyOrders=new ArrayList<OldBuyOrder>();
buyOrders=records.getOldBuyOrders();%>
<tr><td>BrokerId</td><td>Security Name</td><td>Rate</td><td>Quantity</td><td>Direction</td></tr>
<%for(OldBuyOrder buyOrder:buyOrders){ %>
<tr><td><%=buyOrder.getBrokerId()%></td><td><%=buyOrder.getSecName()%></td><td><%=buyOrder.getRate()%></td><td><%=buyOrder.getQuantity()%></td><td><%=buyOrder.getDirection()%></td></tr>
<%}; %>
</table>
<br>
<h3>Sell Details</h3>
<table border="2">
<%
ArrayList<OldSellOrder> sellOrders=new ArrayList<OldSellOrder>();
sellOrders=records.getOldSellOrders();%>
<tr><td>BrokerId</td><td>Security Name</td><td>Rate</td><td>Quantity</td><td>Direction</td></tr>
<%for(OldSellOrder sellOrder:sellOrders){ %>
<tr><td><%=sellOrder.getBrokerId()%></td><td><%=sellOrder.getSecName()%></td><td><%=sellOrder.getRate()%></td><td><%=sellOrder.getQuantity()%></td><td><%=sellOrder.getDirection()%></td></tr>
<%}; %>
</table>
<br>
<center><a href="Welcome.jsp">LogOut</a></center>
</body>
</html>