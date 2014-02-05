<%@page import="pojos.BookingDetails"%>
<%@page import="pojos.UserDetails"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome</title>
</head>
<body><pre>
<h3>Welcome ${userdetails.username}</h3>  
</pre>
Enter Booking Details
<form>
<%BookingDetails details=new BookingDetails(); %>
<input type="text" value="<%=details.getBookId()%>" name="bookId">
<input type="text" name="bookDate">
</form>
</body>
</html>