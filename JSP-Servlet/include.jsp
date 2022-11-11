<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import="java.util.Calendar"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>MY page</h1>
<% out.println("Today is:" +Calendar.getInstance().getTime());
  
%>
<h1>End of the page</h1>
</body>
</html>