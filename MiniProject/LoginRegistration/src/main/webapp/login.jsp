<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
body{
	background-image: url("images/pic2.jpg");
	background-repeat: no-repeat;
	background-size: cover;
}
div{
    position: relative;
    top:200px;
}
</style>

</head>
<body>
	<div align="center">
		
		<h1 style="color: black; color:white;">SIGN IN</h1>
		<form action="ControllerLogic" method="post">
			<table>
				<tr>
					<td style="padding: 15px;font-size: 18px; color:white; ">Username</td>
					<td><input type="text" name="uname"
						style="border-top-style: hidden; border-left-style: hidden; border-right-style: hidden; border-bottom-style: solid;padding: 5px;"></td>
						
				</tr>
				<tr>
					<td style="padding: 15px;font-size: 18px; color:white;">Password</td>
					<td><input type="password" name="pass"
						style="border-top-style: hidden; border-left-style: hidden; border-right-style: hidden; border-bottom-style: solid;padding: 5px;"></td>
						
				</tr>
			</table>
			<br><br>
			<input type="submit" value="Login" >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
			<input type="hidden" name="action" value="log"> 
			<input type="hidden" name="id"><br><br>
			<a href="Register.jsp" style="color:black; font-size: 18px;color:white;">Create an Account</a>
		</form>
</body>
</html>