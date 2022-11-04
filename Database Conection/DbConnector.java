package Connection;

import java.sql.*;

public class DbConnector {
public Connection con;
public Connection Dbconnect()
{
	try 
	{
		Class.forName("com.mysql.jdbc.Driver");//register driver
	} 
	catch (ClassNotFoundException e) 
	{
	
		System.out.println(e);
	}
	
	try 
	{
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/suriya","root","");
	} 
	catch (SQLException e) 
	{
		System.out.println(e);
	}
	return con;
	
}
}
