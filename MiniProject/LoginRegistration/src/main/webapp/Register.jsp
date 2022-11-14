<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<h1>Registration Form</h1>
		<form action="ControllerLogic" method="post">
			<table>
				<tr>
					<td style="padding: 15px;font-size: 18px; color:white;">Username</td>
					<td><input type="text" name="uname"
						style="border-top-style: hidden; border-left-style: hidden; border-right-style: hidden; border-bottom-style: solid; padding: 5px;"></td>

				</tr>
				<tr>
					<td style="padding: 15px;font-size: 18px; color:white;">Password</td>
					<td><input type="password" name="pass"
						style="border-top-style: hidden; border-left-style: hidden; border-right-style: hidden; border-bottom-style: solid; padding: 5px;"></td>

				</tr>
				<tr>
					<td style="padding: 15px;font-size: 18px; color:white;">Email</td>
					<td><input type="email" name="email"
						style="border-top-style: hidden; border-left-style: hidden; border-right-style: hidden; border-bottom-style: solid; padding: 5px;"></td>
				</tr>
				<tr>
					<td style="padding: 15px;font-size: 18px;color:white; ">Contact</td>
					<td><input type="text" name="phno"
						style="border-top-style: hidden; border-left-style: hidden; border-right-style: hidden; border-bottom-style: solid; padding: 5px;"></td>
				</tr>

			</table>
			<br>
			<br> <input type="submit" value="Register" > 
			     <input	type="hidden" name="action" value="reg"> <br><br>
			     <a href="login.jsp" style="color:black; font-size: 18px; color:white;"> Already Registered User?</a>
		</form>
</body>
</html>