<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= "Hello " %><%=request.getParameter("name")%>
<form action="/NewsProject/add" method="post">
<input type="radio" name="group1" value="add">Add
<input type="text" name="content">
<select name="type"><option value="SPORTS">SPORTS</option>
<option value="POLITICS">POLITICS</option>
<option value="OTHERS">OTHERS</option>
</select>
<input type="submit" value="submit">
</form>
<form action="/NewsProject/remove" method="post">
<input type="radio" name="group1" value="remove">Remove
<input type="text" name="id">
<input type="submit" value="submit">
</form>
<form action="/NewsProject/update" method="post">
<input type="radio" name="group1" value="remove">Update
<input type="text" name="id">
<input type="text" name="newsupdate">
<input type="submit" value="submit">
</form>
<form action="/NewsProject/show" method="post">
<input type="radio" name="group1" value="show">Show
<input type="submit" value="submit">
</form>
</body>
</html>