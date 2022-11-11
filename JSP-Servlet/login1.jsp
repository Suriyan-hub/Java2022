<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="LoginValidate" method="post">
<table>
	<tr>
		<td><font face="Noto Serif" size="2px">Name:</font></td>
 		<td><input type="text" name="userName"></td>
	</tr>
	<tr>
		<td><font face="Noto Serif" size="2px">Password:</font></td>
 		<td><input type="password" name="userPassword"></td>
	</tr>
</table>
 	<input type="submit" value="Login">
</form>
</body>
</html>