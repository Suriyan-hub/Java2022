<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%   
String name=request.getParameter("uname");  
out.print("welcome "+name);
//	response.sendRedirect("http://www.google.com");  
session.setAttribute("user", name);

%>  
<a href="first.jsp">FirstPage</a>
</body>
</html>