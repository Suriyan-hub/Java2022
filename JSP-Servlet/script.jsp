<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!	int a=5;
	int square(int n){
		return n*n;
	}%>
<%
	String name=request.getParameter("n1");
	out.println("<h3> Scriptlet tag </h3>");
	out.println("<h4> Name:" +name+ "</h4>");
	out.println("<h3> Value of a:"+a+"<h3>");
%>
<h3> Expression Tag:<%= request.getParameter("n1")%> <br><br>
	<%="Square of number is: "+square(10) %>
</h3>
</body>
</html>