<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags" prefix="h" %>

<%@ page import="com.sanushi.javaweb.basics.User" %>
<%@ page errorPage="error.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="app.css" rel="stylesheet" type="text/css">
<title>${ initParam.Author }</title>
</head>

<body>
<c:import url="header.jsp" var="_header"/>
${_header} 
${_header} 
${_header} 


<h:mytag user="Sanushi" location="Sri Lanka"/>
<h:mytag user="${new_user.name}" />


<%@include file="header.jsp"%>

<a href="/process.jsp">Open Page</a>
<a href="process.jsp">Open Page</a>
<a href='<c:url value="/process.jsp"/>'>Open Page</a>


	<% User user = (User) request.getAttribute("user");
		if(user == null)
			user =  new User();
	%>
	
	
	<h:profile user="${user}"/>
	
	<h1> Welcome <%= user.getName() %> </h1>
	<h2> Using expression language ${ new_user.name } </h2>

	<div class="${ form1.formCssClass.name } ">
	<form action="home" method="post">
		Name: <input type="text" name="name"> <br>
		<input type="submit" value="Submit">
	</form>
	</div>
	
	
	<h2><c:out value="Math Form" /></h2>
	<div class="${ form2.formCssClass.name } ">
	<form action="process.jsp">  
		No1:<input type="text" name="n1" /><br/><br/>  
		No1:<input type="text" name="n2" /><br/><br/>  
		<input type="submit" value="divide"/>  
	</form>  
	</div>
	
	
	<div>
		<ul>
			<li> ${ form2.tabNames[0] } </li>
			<li> ${ form2.tabNames[1] } </li>
			<li> ${ form2.tabNames[2] } </li>
			<li> ${ form2.tabNames[3] } </li>
		</ul>
	</div>
	
	
	
	<div>
		<ul>
			<c:forEach items="${ form2.tabs }" var="tab">
				<li><a href="${ tab.url }"> ${ tab.name } </a></li>
			</c:forEach>
		</ul>
	</div>
	
	
	<div>
		<h1>Using operators in Expression Language</h1>
		<p>${ 3 == 2 }</p>
		<p>${ user.name == "San" }</p>		
	</div>
	
	
	<div>
		<c:if test="${!empty user.name}">
		<p>Welcome ${ user.name }</p>
		</c:if>
		<c:if test="${empty user.name}">
		<p>Welcome anonymous user</p>
		</c:if>
	</div>
	
	
	<div>
		<c:choose>
			<c:when test="${ 3 + 2 == 4 }">
				<p>Answer is incorrect</p>
			</c:when>
			<c:when test="${ 3 + 2 == 5 }">
				<p>Answer is correct</p>
			</c:when>
			<c:otherwise>
				<p>Answer is incorrect</p>
			</c:otherwise>
		</c:choose>
	</div>
	
</body>
</html>