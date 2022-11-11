<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.*"%>
<!DOCTYPE html>
<%! 
 	int a=20;
 	int b=10;
 	int n=3;
%>
<html>
<head>
<meta charset="UTF-8">
<title>Switch Statement</title>
</head>
<body>
<%	
	switch(n)
	{
            case 0:
               out.println("<h1>Sum :</h1>"+(a+b));
               break;
            case 1:
            	out.println("Subtract :"+(a-b));
               break;
            case 2:
            	out.println("Multiplication : "+(a*b));
               break;
            case 3:
            	 out.println("<h1>Division :</h1>"+(a/b));
               break;
            default:
               out.println("Invalid choice");
}%>
</body>
</html>