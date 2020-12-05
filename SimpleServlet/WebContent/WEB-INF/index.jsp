<%@ page import="com.sanushi.javaweb.basics.User" %>
<%@ page errorPage="_error.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@include file="header.jsp"%>

	<% User user = (User) request.getAttribute("user");
		if(user == null)
			user =  new User();
	%>
	
	<h1> Welcome <%= user.getName() %> </h1>

	<form action="home" method="post">
		Name: <input type="text" name="name"> <br>
		<input type="submit" value="Submit">
	</form>
	
	
	<h2>Math Form</h2>
	<form action="process.jsp">  
		No1:<input type="text" name="n1" /><br/><br/>  
		No1:<input type="text" name="n2" /><br/><br/>  
		<input type="submit" value="divide"/>  
	</form>  
</body>
</html>