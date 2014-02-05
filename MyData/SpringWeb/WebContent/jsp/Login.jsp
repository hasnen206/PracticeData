<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action="/SpringWeb/validate" method="post">
<table>
<tr><td>Enter UserName</td><td><input type="text" name="uname" value="<%= request.getAttribute("uname")%>"></tr>
<tr><td></td></tr>
<tr><td></td></tr>
<tr><td>Enter Password</td><td><input type="password" name="password"></tr>
<tr><td><input type="submit" value="submit"></tr>
</table>
</form>
</body>
</html>