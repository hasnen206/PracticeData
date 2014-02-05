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
<title>ORDER PLACING</title>
</head>
<body>
<form action="/IBProject/addorder" method="post">
<table>

<tr><td>Enter Your Id</td><td><input type="text" name="brokerid"></td></tr>
<tr><td>Enter SecurityName</td><td><input type="text" name="security"></td></tr>
<tr><td>Enter Rate</td><td><input type="text" name="rate"></td></tr>
<tr><td>Enter Quantity</td><td><input type="text" name="quantity"></td></tr>
<tr><td>Choose Please</td><td><select name="direction"><option value="BUY">BUY</option>
														<option value="SELL">SELL</option></select></td></tr>
<tr><td><input type="submit" value="submit">		
</td></tr>												
</table>
</form>
</body>
</html>