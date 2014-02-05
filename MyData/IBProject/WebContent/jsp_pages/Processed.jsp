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
<title>Net Position</title>
</head>
<body border="2">
<%CurrentPosition position=new CurrentPosition();
String security=request.getParameter("security");%>
<table>
<tr><td>Security Name</td><td>Net Position</td></tr>
<tr><td><%=security %></td><td><%=position.getNetPosition(security)%></td></tr>
</table>
</body>

</html>