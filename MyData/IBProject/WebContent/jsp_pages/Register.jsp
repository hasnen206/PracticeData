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
<title>Register Page</title>
</head>
<body>
<h3><B>Please Register</B></h3><br><br>
<form action="/IBProject/add" method="post">
<table>
<tr><th><h4>Register</h4></th></tr>

<tr><td>Enter Name</td><td><input type="text" name="uname"></td></tr>
<tr><td>Enter Password</td><td><input type="password" name="password"></td></tr>
<tr><td><input type="submit" value="submit"></td></tr>
</table>
</form>
</body>
</html>