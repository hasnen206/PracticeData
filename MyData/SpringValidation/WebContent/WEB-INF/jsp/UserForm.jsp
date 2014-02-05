<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<style type="text/css">
.error{color:red; font-style: italic;}
</style>
<body>
<f:form method="post" commandName="POJO">
UserName <f:input path="username"/><f:errors path="username" cssClass="error"></f:errors>
Password <f:password path="password"/><f:errors path="password" cssClass="error"></f:errors>
<input type="submit"/>
</f:form>
</body>
</html>