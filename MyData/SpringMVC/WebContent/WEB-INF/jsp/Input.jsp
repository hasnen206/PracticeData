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
<f:form method="post" commandName="POJO">
<pre>
UserName: <f:input path="username"/>
Password: <f:password path="password"/>
Gender:   <f:radiobutton path="gender" value="Male" label="Male"/>
          <f:radiobutton path="gender" value="Female" label="Female"/>
Country:  <f:select path="country">
           <f:option value="India" label="India"/>
           <f:option value="US" label="US"/>
           <f:option value="UK" label="UK"/>
        </f:select>
About YOU: <f:textarea path="aboutYou"/>
Community  <f:checkbox path="community" value="Spring" label="Spring"/>
           <f:checkbox path="community" value="Java" label="Java"/>
           <f:checkbox path="community" value="Hibernate" label="Hibernate"/>   
  <input type="submit">         
</pre>     
</f:form>
</body>
</html>