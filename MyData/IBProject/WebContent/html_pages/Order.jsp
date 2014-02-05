<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<form action="" method="post">
<tr><td>Enter Your Id</td><td><input type="text" name="brokerid"></td></tr>
<tr><td>Enter SecurityName</td><td><input type="text" name="security"></td></tr>
<tr><td>Enter Rate</td><td><input type="text" name="rate"></td></tr>
<tr><td>Enter Quantity</td><td><input type="text" name="quantity"></td></tr>
<tr><td>Choose Please</td><td><select name="direction"><option value="BUY">BUY</option>
														<option value="SELL">SELL</option></select></td></tr>
<tr><td><input type="submit" name="submit" value="submit">		
</td></tr></form>												
</table>

<center><a href="Welcome.html">LogOut</a></center>
</body>
</html>