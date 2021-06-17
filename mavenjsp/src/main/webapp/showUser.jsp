<%@page import="com.maven.web.model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<%

	User u1=(User)request.getAttribute("User");
	out.println(u1);
%>
</body>
</html>