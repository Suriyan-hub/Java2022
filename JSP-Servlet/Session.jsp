<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@ page session="true" %>
<%  int i=10,j=20;
	int sum= i+j ;
	out.println("Sum is :" +sum);
	session.setAttribute("SUM", sum);
	session.getAttribute("SUM");
	out.println("Session value:" +session.getAttribute("SUM"));
%>
</body>
</html>