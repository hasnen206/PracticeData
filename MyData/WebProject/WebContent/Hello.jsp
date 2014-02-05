<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Register</title>
</head>
<body>
<f:form name="LoginPage" method="post" commandName="userdetails" modelAttribute="userdetails">
<pre>
UserName: <f:input path="username" name="username" />
Password: <f:password path="password" name="password"/>
  <input type="submit" onclick="validate()"/>         
</pre>     
</f:form>
<script>
function validate(){
	if(document.LoginPage.username=="null" && document.LoginPage.password=="null"){
		alert("Please enter UserName and Password");
	}
}
</script>
</body>
</html>