package DAO;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import bean.Bean;
import jakarta.security.auth.message.callback.PrivateKeyCallback.Request;
import jakarta.servlet.http.HttpSession;


public class RegisterDao {
	String dbdriver="com.mysql.jdbs.Driver";
	String dburl="jdbc:mysql://localhost:3306/userdb";
	String dbuser="root";
	String dbpass="root";
	Connection con;
	Statement st;
	PreparedStatement ps;
	ResultSet rs;
	HttpSession session;
	public Connection dbConnect()
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
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb","root","root");
		} 
		catch (SQLException e) 
		{
			System.out.println(e);
		}
		return con;
		
	}
 public String loginUser(Bean b)
 {
	 con=dbConnect();
	 
	 String user=b.getUname();
	 String pass=b.getPassword();
	 String sql="select * from register where uname=? and password=?";
	try {
		
		ps=con.prepareStatement(sql);
		ps.setString(1, user);
		ps.setString(2, pass);
		rs=ps.executeQuery();
		
		if(rs.next()) {
			return "success";
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		System.out.println(e);
	}
	 return "";
 }
 public String regUser(Bean b)
	{
	 	
		String query="insert into register(uname,password,email,phone) values(?,?,?,?)";
		try
		{
		con=dbConnect();
		ps=con.prepareStatement(query); 
		ps.setString(1,b.getUname());
		ps.setString(2,b.getPassword()); 
		ps.setString(3,b.getEmail());
		ps.setString(4,b.getPhone());
		int i=ps.executeUpdate();
		System.out.println("i : " +i);
		if(i!=0)
		{
			return "success";
		}
	}
	catch(Exception e)
	{
	System.out.println(e);	
	}
		return "";
	
	}
 public ArrayList<Bean> viewUser() 
	{
		ArrayList<Bean> list=new ArrayList<Bean>();
		try
		{
			Bean b=new Bean();
			con=dbConnect();
			String query="select * from register";
			st=con.createStatement();
			rs=st.executeQuery(query);
			while(rs.next())
			{
				
				b.setUid(rs.getInt("uid"));
				System.out.println("uid" +b.getUid());
				b.setUname(rs.getString("uname"));
				b.setPassword(rs.getString("password"));
				b.setEmail(rs.getString("email"));
				b.setPhone(rs.getString("phone"));
				list.add(b);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return list;
	}
}

