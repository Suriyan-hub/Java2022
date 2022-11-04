package Connection;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DbConnector dobj=new DbConnector();
		Connection con;
		ResultSet rs;
		Statement st;
	try
		{
			String query="select * from student1";
			con=dobj.Dbconnect();
			st=con.createStatement();
			rs=st.executeQuery(query);
			while(rs.next())
			{
				System.out.print(rs.getInt("id"));
				System.out.print(" "+rs.getString("name"));
				System.out.print(" "+rs.getString("phno"));
				System.out.println();
			}
			
		} 
	catch (Exception e) 
	{
		System.out.println(e);
		}
		
	}

}
