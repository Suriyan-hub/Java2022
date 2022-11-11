<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <form>
            <fieldset style="width:50%;height:50%; background-color: yellow ;">
                <legend><b>JSP Application<b></legend>
                <h3>Current Date and Time</h3>
                <% java.util.Date d = new java.util.Date();
                out.println(d.toString()); %>
            </fieldset>
        </form>
</body>
</html>