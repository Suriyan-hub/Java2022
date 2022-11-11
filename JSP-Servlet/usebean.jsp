<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="com.calculate.Addition"></jsp:useBean>
<%
int r=obj.add(50,50);
out.println("The sum is:"+r);
%>
</body>
</html>