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
<title>Clearing House</title>
</head>
<body>
<i><h2>For Net Position, Enter The Security Name </h2></i>
<form action="/IBProject/clearing" method="post">
<input type="text" name="security">
<input type="submit" value="Process">
</form>
</body>
</html>